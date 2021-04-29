
package aiss.model.flicker;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page",
    "pages",
    "perpage",
    "total",
    "photo"
})
@Generated("jsonschema2pojo")
public class Photos implements Serializable
{

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("pages")
    private Integer pages;
    @JsonProperty("perpage")
    private Integer perpage;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("photo")
    private List<Photo> photo = null;
    private final static long serialVersionUID = -5881251483134811899L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Photos() {
    }

    /**
     * 
     * @param perpage
     * @param total
     * @param pages
     * @param photo
     * @param page
     */
    public Photos(Integer page, Integer pages, Integer perpage, Integer total, List<Photo> photo) {
        super();
        this.page = page;
        this.pages = pages;
        this.perpage = perpage;
        this.total = total;
        this.photo = photo;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("pages")
    public Integer getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @JsonProperty("perpage")
    public Integer getPerpage() {
        return perpage;
    }

    @JsonProperty("perpage")
    public void setPerpage(Integer perpage) {
        this.perpage = perpage;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("photo")
    public List<Photo> getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(List<Photo> photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Photos.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("page");
        sb.append('=');
        sb.append(((this.page == null)?"<null>":this.page));
        sb.append(',');
        sb.append("pages");
        sb.append('=');
        sb.append(((this.pages == null)?"<null>":this.pages));
        sb.append(',');
        sb.append("perpage");
        sb.append('=');
        sb.append(((this.perpage == null)?"<null>":this.perpage));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("photo");
        sb.append('=');
        sb.append(((this.photo == null)?"<null>":this.photo));
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
        result = ((result* 31)+((this.photo == null)? 0 :this.photo.hashCode()));
        result = ((result* 31)+((this.perpage == null)? 0 :this.perpage.hashCode()));
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.page == null)? 0 :this.page.hashCode()));
        result = ((result* 31)+((this.pages == null)? 0 :this.pages.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Photos) == false) {
            return false;
        }
        Photos rhs = ((Photos) other);
        return ((((((this.photo == rhs.photo)||((this.photo!= null)&&this.photo.equals(rhs.photo)))&&((this.perpage == rhs.perpage)||((this.perpage!= null)&&this.perpage.equals(rhs.perpage))))&&((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total))))&&((this.page == rhs.page)||((this.page!= null)&&this.page.equals(rhs.page))))&&((this.pages == rhs.pages)||((this.pages!= null)&&this.pages.equals(rhs.pages))));
    }

}
