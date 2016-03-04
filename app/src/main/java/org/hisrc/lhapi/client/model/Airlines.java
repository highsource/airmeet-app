package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.Airline;







public class Airlines   {
  
  private List<Airline> airline = new ArrayList<Airline>();

  
  /**
   **/
  public Airlines airline(List<Airline> airline) {
    this.airline = airline;
    return this;
  }
  
  @JsonProperty("Airline")
  public List<Airline> getAirline() {
    return airline;
  }
  public void setAirline(List<Airline> airline) {
    this.airline = airline;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airlines airlines = (Airlines) o;
    return Objects.equals(this.airline, airlines.airline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airlines {\n");
    
    sb.append("    airline: ").append(toIndentedString(airline)).append("\n");
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



