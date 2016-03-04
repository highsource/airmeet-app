package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;







public class DateTimeObject   {
  
  private DateTime dateTime = null;

  
  /**
   **/
  public DateTimeObject dateTime(DateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }
  
  @JsonProperty("DateTime")
  public DateTime getDateTime() {
    return dateTime;
  }
  public void setDateTime(DateTime dateTime) {
    this.dateTime = dateTime;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeObject dateTimeObject = (DateTimeObject) o;
    return Objects.equals(this.dateTime, dateTimeObject.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeObject {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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



