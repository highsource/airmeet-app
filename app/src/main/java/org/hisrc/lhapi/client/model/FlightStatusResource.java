package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Flights;







public class FlightStatusResource   {
  
  private Flights flights = null;

  
  /**
   **/
  public FlightStatusResource flights(Flights flights) {
    this.flights = flights;
    return this;
  }
  
  @JsonProperty("Flights")
  public Flights getFlights() {
    return flights;
  }
  public void setFlights(Flights flights) {
    this.flights = flights;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightStatusResource flightStatusResource = (FlightStatusResource) o;
    return Objects.equals(this.flights, flightStatusResource.flights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightStatusResource {\n");
    
    sb.append("    flights: ").append(toIndentedString(flights)).append("\n");
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



