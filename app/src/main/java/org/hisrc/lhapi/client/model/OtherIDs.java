package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.OtherID;







public class OtherIDs   {
  
  private List<OtherID> otherID = new ArrayList<OtherID>();

  
  /**
   **/
  public OtherIDs otherID(List<OtherID> otherID) {
    this.otherID = otherID;
    return this;
  }
  
  @JsonProperty("OtherID")
  public List<OtherID> getOtherID() {
    return otherID;
  }
  public void setOtherID(List<OtherID> otherID) {
    this.otherID = otherID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherIDs otherIDs = (OtherIDs) o;
    return Objects.equals(this.otherID, otherIDs.otherID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherIDs {\n");
    
    sb.append("    otherID: ").append(toIndentedString(otherID)).append("\n");
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



