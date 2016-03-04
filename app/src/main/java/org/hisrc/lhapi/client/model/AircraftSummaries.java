package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.AircraftSummary;







public class AircraftSummaries   {
  
  private List<AircraftSummary> aircraftSummary = new ArrayList<AircraftSummary>();

  
  /**
   **/
  public AircraftSummaries aircraftSummary(List<AircraftSummary> aircraftSummary) {
    this.aircraftSummary = aircraftSummary;
    return this;
  }
  
  @JsonProperty("AircraftSummary")
  public List<AircraftSummary> getAircraftSummary() {
    return aircraftSummary;
  }
  public void setAircraftSummary(List<AircraftSummary> aircraftSummary) {
    this.aircraftSummary = aircraftSummary;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AircraftSummaries aircraftSummaries = (AircraftSummaries) o;
    return Objects.equals(this.aircraftSummary, aircraftSummaries.aircraftSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aircraftSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftSummaries {\n");
    
    sb.append("    aircraftSummary: ").append(toIndentedString(aircraftSummary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



