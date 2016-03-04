package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;







public class OtherID   {
  
  private String description = null;
  private String value = null;

  
  /**
   **/
  public OtherID description(String description) {
    this.description = description;
    return this;
  }
  
  @JsonProperty("@Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public OtherID value(String value) {
    this.value = value;
    return this;
  }
  
  @JsonProperty("$")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherID otherID = (OtherID) o;
    return Objects.equals(this.description, otherID.description) &&
        Objects.equals(this.value, otherID.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherID {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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



