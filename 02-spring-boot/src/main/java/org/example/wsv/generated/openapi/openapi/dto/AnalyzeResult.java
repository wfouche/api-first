package org.example.wsv.generated.openapi.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.jspecify.annotations.Nullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalyzeResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-02T17:14:36.803876218+02:00[Africa/Johannesburg]", comments = "Generator version: 7.27.0")
public class AnalyzeResult {

  private String id;

  private String analysis;

  public AnalyzeResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnalyzeResult(String id, String analysis) {
    this.id = id;
    this.analysis = analysis;
  }

  public AnalyzeResult id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public AnalyzeResult analysis(String analysis) {
    this.analysis = analysis;
    return this;
  }

  /**
   * Get analysis
   * @return analysis
   */
  @NotNull 
  @Schema(name = "analysis", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("analysis")
  public String getAnalysis() {
    return analysis;
  }

  @JsonProperty("analysis")
  public void setAnalysis(String analysis) {
    this.analysis = analysis;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeResult analyzeResult = (AnalyzeResult) o;
    return Objects.equals(this.id, analyzeResult.id) &&
        Objects.equals(this.analysis, analyzeResult.analysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, analysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeResult {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    analysis: ").append(toIndentedString(analysis)).append("\n");
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

