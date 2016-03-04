package org.hisrc.lhapi.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.hisrc.lhapi.client.model.MediaLink;







public class MediaLinks   {
  
  private List<MediaLink> mediaLink = new ArrayList<MediaLink>();

  
  /**
   **/
  public MediaLinks mediaLink(List<MediaLink> mediaLink) {
    this.mediaLink = mediaLink;
    return this;
  }
  
  @JsonProperty("MediaLink")
  public List<MediaLink> getMediaLink() {
    return mediaLink;
  }
  public void setMediaLink(List<MediaLink> mediaLink) {
    this.mediaLink = mediaLink;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaLinks mediaLinks = (MediaLinks) o;
    return Objects.equals(this.mediaLink, mediaLinks.mediaLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaLinks {\n");
    
    sb.append("    mediaLink: ").append(toIndentedString(mediaLink)).append("\n");
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



