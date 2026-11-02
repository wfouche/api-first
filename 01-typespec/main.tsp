import "@typespec/http";
import "@typespec/rest";
import "@typespec/openapi3";

using TypeSpec.Http;
using TypeSpec.Rest;

@server("https://api.weatherService.com/v1", "Production Weather API")
namespace WeatherService {
  /**
   * The unit system to use for temperature and wind measurements.
   */
  enum UnitSystem {
    metric: "metric",
    imperial: "imperial",
  }

  /**
   * Current weather conditions for a specific location.
   */
  model CurrentWeather {
    @visibility(Lifecycle.Read)
    id: string;

    /** Name of the city or location */
    location: string;

    /** Temperature in the requested unit system */
    temperature: float32;

    /** Real-feel temperature */
    feelsLike: float32;

    /** Humidity percentage (0-100) */
    humidity: int32;

    /** Wind speed */
    windSpeed: float32;

    /** Textual description of weather conditions (e.g., "Sunny", "Light Rain") */
    condition: string;

    /** Timestamp of when the reading was taken */
    recordedAt: utcDateTime;
  }

  /**
   * Daily forecast entry.
   */
  model ForecastDay {
    date: plainDate;
    maxTemp: float32;
    minTemp: float32;
    condition: string;
    chanceOfRain: int32;
  }

  /**
   * Multi-day forecast response.
   */
  model ForecastResponse {
    location: string;
    units: UnitSystem;
    days: ForecastDay[];
  }

  /**
   * Standard error response model.
   */
  model ErrorResponse {
    code: string;
    message: string;
    details?: string[];
  }

  @route("/weather")
  interface Weather {
    /**
     * Get the current weather conditions for a given location.
     */
    @get
    getCurrent(
      @query location: string,
      @query units?: UnitSystem = UnitSystem.metric,
    ): CurrentWeather | ErrorResponse;

    /**
     * Get a multi-day weather forecast for a location.
     */
    @get
    @route("/forecast")
    getForecast(
      @query location: string,
      @query days: int32 = 7,
      @query units?: UnitSystem = UnitSystem.metric,
    ): ForecastResponse | ErrorResponse;
  }
}
