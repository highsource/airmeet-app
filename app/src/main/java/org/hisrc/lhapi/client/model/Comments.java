package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.Comment;







public class Comments   {
  
  private List<Comment> comment = new ArrayList<Comment>();

  
  /**
   **/
  public Comments comment(List<Comment> comment) {
    this.comment = comment;
    return this;
  }
  
  @JsonProperty("Comment")
  public List<Comment> getComment() {
    return comment;
  }
  public void setComment(List<Comment> comment) {
    this.comment = comment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comments comments = (Comments) o;
    return Objects.equals(this.comment, comments.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comments {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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



