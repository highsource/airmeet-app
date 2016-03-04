package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;







public class MediaLink   {
  
  private String languageCode = null;
  private String value = null;

  
  /**
   **/
  public MediaLink languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }
  
  @JsonProperty("@LanguageCode")
  public String getLanguageCode() {
    return languageCode;
  }
  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  
  /**
   **/
  public MediaLink value(String value) {
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
    MediaLink mediaLink = (MediaLink) o;
    return Objects.equals(this.languageCode, mediaLink.languageCode) &&
        Objects.equals(this.value, mediaLink.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaLink {\n");
    
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
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



