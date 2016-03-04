package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.Flight;







public class Flights   {
  
  private List<Flight> flight = new ArrayList<Flight>();

  
  /**
   **/
  public Flights flight(List<Flight> flight) {
    this.flight = flight;
    return this;
  }
  
  @JsonProperty("Flight")
  public List<Flight> getFlight() {
    return flight;
  }
  public void setFlight(List<Flight> flight) {
    this.flight = flight;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Flights flights = (Flights) o;
    return Objects.equals(this.flight, flights.flight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Flights {\n");
    
    sb.append("    flight: ").append(toIndentedString(flight)).append("\n");
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



