package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.FlightsStatusResource;







public class FlightsStatusResponse   {
  
  private FlightsStatusResource flightStatusResource = null;

  
  /**
   **/
  public FlightsStatusResponse flightStatusResource(FlightsStatusResource flightStatusResource) {
    this.flightStatusResource = flightStatusResource;
    return this;
  }
  
  @JsonProperty("FlightStatusResource")
  public FlightsStatusResource getFlightStatusResource() {
    return flightStatusResource;
  }
  public void setFlightStatusResource(FlightsStatusResource flightStatusResource) {
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
    FlightsStatusResponse flightsStatusResponse = (FlightsStatusResponse) o;
    return Objects.equals(this.flightStatusResource, flightsStatusResponse.flightStatusResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flightStatusResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightsStatusResponse {\n");
    
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



