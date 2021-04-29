
package aiss.model.flicker;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "photos",
    "stat"
})
@Generated("jsonschema2pojo")
public class PhotoSearch implements Serializable
{

    @JsonProperty("photos")
    private Photos photos;
    @JsonProperty("stat")
    private String stat;
    private final static long serialVersionUID = -5007879578508441770L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PhotoSearch() {
    }

    /**
     * 
     * @param stat
     * @param photos
     */
    public PhotoSearch(Photos photos, String stat) {
        super();
        this.photos = photos;
        this.stat = stat;
    }

    @JsonProperty("photos")
    public Photos getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    @JsonProperty("stat")
    public String getStat() {
        return stat;
    }

    @JsonProperty("stat")
    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhotoSearch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("photos");
        sb.append('=');
        sb.append(((this.photos == null)?"<null>":this.photos));
        sb.append(',');
        sb.append("stat");
        sb.append('=');
        sb.append(((this.stat == null)?"<null>":this.stat));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.photos == null)? 0 :this.photos.hashCode()));
        result = ((result* 31)+((this.stat == null)? 0 :this.stat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhotoSearch) == false) {
            return false;
        }
        PhotoSearch rhs = ((PhotoSearch) other);
        return (((this.photos == rhs.photos)||((this.photos!= null)&&this.photos.equals(rhs.photos)))&&((this.stat == rhs.stat)||((this.stat!= null)&&this.stat.equals(rhs.stat))));
    }

}
