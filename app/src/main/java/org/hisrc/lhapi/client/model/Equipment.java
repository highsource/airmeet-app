package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;







public class Equipment   {
  
  private String aircraftCode = null;

  
  /**
   **/
  public Equipment aircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
    return this;
  }
  
  @JsonProperty("AircraftCode")
  public String getAircraftCode() {
    return aircraftCode;
  }
  public void setAircraftCode(String aircraftCode) {
    this.aircraftCode = aircraftCode;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Equipment equipment = (Equipment) o;
    return Objects.equals(this.aircraftCode, equipment.aircraftCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aircraftCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Equipment {\n");
    
    sb.append("    aircraftCode: ").append(toIndentedString(aircraftCode)).append("\n");
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



