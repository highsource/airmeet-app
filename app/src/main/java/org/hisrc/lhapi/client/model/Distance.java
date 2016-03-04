package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;







public class Distance   {
  
  private Double value = null;
  private String UOM = null;

  
  /**
   **/
  public Distance value(Double value) {
    this.value = value;
    return this;
  }
  
  @JsonProperty("Value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  
  /**
   **/
  public Distance UOM(String UOM) {
    this.UOM = UOM;
    return this;
  }
  
  @JsonProperty("UOM")
  public String getUOM() {
    return UOM;
  }
  public void setUOM(String UOM) {
    this.UOM = UOM;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Distance distance = (Distance) o;
    return Objects.equals(this.value, distance.value) &&
        Objects.equals(this.UOM, distance.UOM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, UOM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Distance {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    UOM: ").append(toIndentedString(UOM)).append("\n");
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



