package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.AircraftSummaries;







public class AircraftResource   {
  
  private AircraftSummaries aircraftSummaries = null;

  
  /**
   **/
  public AircraftResource aircraftSummaries(AircraftSummaries aircraftSummaries) {
    this.aircraftSummaries = aircraftSummaries;
    return this;
  }
  
  @JsonProperty("AircraftSummaries")
  public AircraftSummaries getAircraftSummaries() {
    return aircraftSummaries;
  }
  public void setAircraftSummaries(AircraftSummaries aircraftSummaries) {
    this.aircraftSummaries = aircraftSummaries;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AircraftResource aircraftResource = (AircraftResource) o;
    return Objects.equals(this.aircraftSummaries, aircraftResource.aircraftSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aircraftSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftResource {\n");
    
    sb.append("    aircraftSummaries: ").append(toIndentedString(aircraftSummaries)).append("\n");
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



