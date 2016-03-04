package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.FlightStatusResource;





public class FlightStatusResponse   {
  
  private FlightStatusResource flightStatusResource = null;

  
  /**
   **/
  public FlightStatusResponse flightStatusResource(FlightStatusResource flightStatusResource) {
    this.flightStatusResource = flightStatusResource;
    return this;
  }
  
  @JsonProperty("FlightStatusResource")
  public FlightStatusResource getFlightStatusResource() {
    return flightStatusResource;
  }
  public void setFlightStatusResource(FlightStatusResource flightStatusResource) {
    this.flightStatusResource = flightStatusResource;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightStatusResponse flightStatusResponse = (FlightStatusResponse) o;
    return Objects.equals(this.flightStatusResource, flightStatusResponse.flightStatusResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightStatusResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightStatusResponse {\n");
    
    sb.append("    flightStatusResource: ").append(toIndentedString(flightStatusResource)).append("\n");
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



