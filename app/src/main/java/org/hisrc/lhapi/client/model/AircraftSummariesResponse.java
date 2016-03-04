package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.AircraftResource;







public class AircraftSummariesResponse   {
  
  private AircraftResource aircraftResource = null;

  
  /**
   **/
  public AircraftSummariesResponse aircraftResource(AircraftResource aircraftResource) {
    this.aircraftResource = aircraftResource;
    return this;
  }
  
  @JsonProperty("AircraftResource")
  public AircraftResource getAircraftResource() {
    return aircraftResource;
  }
  public void setAircraftResource(AircraftResource aircraftResource) {
    this.aircraftResource = aircraftResource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AircraftSummariesResponse aircraftSummariesResponse = (AircraftSummariesResponse) o;
    return Objects.equals(this.aircraftResource, aircraftSummariesResponse.aircraftResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aircraftResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AircraftSummariesResponse {\n");
    
    sb.append("    aircraftResource: ").append(toIndentedString(aircraftResource)).append("\n");
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



