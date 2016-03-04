package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;







public class Terminal   {
  
  private String name = null;
  private String gate = null;

  
  /**
   **/
  public Terminal name(String name) {
    this.name = name;
    return this;
  }
  
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Terminal gate(String gate) {
    this.gate = gate;
    return this;
  }
  
  @JsonProperty("Gate")
  public String getGate() {
    return gate;
  }
  public void setGate(String gate) {
    this.gate = gate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Terminal terminal = (Terminal) o;
    return Objects.equals(this.name, terminal.name) &&
        Objects.equals(this.gate, terminal.gate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, gate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Terminal {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gate: ").append(toIndentedString(gate)).append("\n");
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



