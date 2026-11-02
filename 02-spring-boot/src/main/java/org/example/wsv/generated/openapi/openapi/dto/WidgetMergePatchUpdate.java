package org.example.wsv.generated.openapi.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.jspecify.annotations.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * WidgetMergePatchUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.27.0")
public class WidgetMergePatchUpdate {

  private @Nullable String id;

  private @Nullable Integer weight;

  /**
   * Gets or Sets color
   */
  public enum ColorEnum {
    RED("red"),
    
    BLUE("blue");

    private final String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ColorEnum color;

  public WidgetMergePatchUpdate id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public WidgetMergePatchUpdate weight(@Nullable Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public @Nullable Integer getWeight() {
    return weight;
  }

  @JsonProperty("weight")
  public void setWeight(@Nullable Integer weight) {
    this.weight = weight;
  }

  public WidgetMergePatchUpdate color(@Nullable ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
   */
  
  @Schema(name = "color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public @Nullable ColorEnum getColor() {
    return color;
  }

  @JsonProperty("color")
  public void setColor(@Nullable ColorEnum color) {
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetMergePatchUpdate widgetMergePatchUpdate = (WidgetMergePatchUpdate) o;
    return Objects.equals(this.id, widgetMergePatchUpdate.id) &&
        Objects.equals(this.weight, widgetMergePatchUpdate.weight) &&
        Objects.equals(this.color, widgetMergePatchUpdate.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weight, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetMergePatchUpdate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

