package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hisrc.lhapi.client.model.Airlines;







public class AirlineResource   {
  
  private Airlines airlines = null;

  
  /**
   **/
  public AirlineResource airlines(Airlines airlines) {
    this.airlines = airlines;
    return this;
  }
  
  @JsonProperty("Airlines")
  public Airlines getAirlines() {
    return airlines;
  }
  public void setAirlines(Airlines airlines) {
    this.airlines = airlines;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlineResource airlineResource = (AirlineResource) o;
    return Objects.equals(this.airlines, airlineResource.airlines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airlines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlineResource {\n");
    
    sb.append("    airlines: ").append(toIndentedString(airlines)).append("\n");
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



