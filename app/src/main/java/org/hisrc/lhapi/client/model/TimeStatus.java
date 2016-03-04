package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;







public class TimeStatus   {
  


  public enum CodeEnum {
    FE("FE"),
    NI("NI"),
    OT("OT"),
    DL("DL"),
    NO("NO");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CodeEnum code = null;
  private String definition = null;

  
  /**
   **/
  public TimeStatus code(CodeEnum code) {
    this.code = code;
    return this;
  }
  
  @JsonProperty("Code")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }

  
  /**
   **/
  public TimeStatus definition(String definition) {
    this.definition = definition;
    return this;
  }
  
  @JsonProperty("Definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeStatus timeStatus = (TimeStatus) o;
    return Objects.equals(this.code, timeStatus.code) &&
        Objects.equals(this.definition, timeStatus.definition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, definition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeStatus {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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



