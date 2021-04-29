
package aiss.model.flicker;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "owner",
    "secret",
    "server",
    "farm",
    "title",
    "ispublic",
    "isfriend",
    "isfamily",
    "is_primary",
    "has_comment"
})
@Generated("jsonschema2pojo")
public class Photo implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("server")
    private String server;
    @JsonProperty("farm")
    private Integer farm;
    @JsonProperty("title")
    private String title;
    @JsonProperty("ispublic")
    private Integer ispublic;
    @JsonProperty("isfriend")
    private Integer isfriend;
    @JsonProperty("isfamily")
    private Integer isfamily;
    @JsonProperty("is_primary")
    private Integer isPrimary;
    @JsonProperty("has_comment")
    private Integer hasComment;
    private final static long serialVersionUID = 3296749362864164223L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Photo() {
    }

    /**
     * 
     * @param owner
     * @param server
     * @param ispublic
     * @param isfriend
     * @param isPrimary
     * @param farm
     * @param id
     * @param secret
     * @param title
     * @param hasComment
     * @param isfamily
     */
    public Photo(String id, String owner, String secret, String server, Integer farm, String title, Integer ispublic, Integer isfriend, Integer isfamily, Integer isPrimary, Integer hasComment) {
        super();
        this.id = id;
        this.owner = owner;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.title = title;
        this.ispublic = ispublic;
        this.isfriend = isfriend;
        this.isfamily = isfamily;
        this.isPrimary = isPrimary;
        this.hasComment = hasComment;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    @JsonProperty("server")
    public String getServer() {
        return server;
    }

    @JsonProperty("server")
    public void setServer(String server) {
        this.server = server;
    }

    @JsonProperty("farm")
    public Integer getFarm() {
        return farm;
    }

    @JsonProperty("farm")
    public void setFarm(Integer farm) {
        this.farm = farm;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("ispublic")
    public Integer getIspublic() {
        return ispublic;
    }

    @JsonProperty("ispublic")
    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    @JsonProperty("isfriend")
    public Integer getIsfriend() {
        return isfriend;
    }

    @JsonProperty("isfriend")
    public void setIsfriend(Integer isfriend) {
        this.isfriend = isfriend;
    }

    @JsonProperty("isfamily")
    public Integer getIsfamily() {
        return isfamily;
    }

    @JsonProperty("isfamily")
    public void setIsfamily(Integer isfamily) {
        this.isfamily = isfamily;
    }

    @JsonProperty("is_primary")
    public Integer getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("is_primary")
    public void setIsPrimary(Integer isPrimary) {
        this.isPrimary = isPrimary;
    }

    @JsonProperty("has_comment")
    public Integer getHasComment() {
        return hasComment;
    }

    @JsonProperty("has_comment")
    public void setHasComment(Integer hasComment) {
        this.hasComment = hasComment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Photo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
        sb.append(',');
        sb.append("server");
        sb.append('=');
        sb.append(((this.server == null)?"<null>":this.server));
        sb.append(',');
        sb.append("farm");
        sb.append('=');
        sb.append(((this.farm == null)?"<null>":this.farm));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("ispublic");
        sb.append('=');
        sb.append(((this.ispublic == null)?"<null>":this.ispublic));
        sb.append(',');
        sb.append("isfriend");
        sb.append('=');
        sb.append(((this.isfriend == null)?"<null>":this.isfriend));
        sb.append(',');
        sb.append("isfamily");
        sb.append('=');
        sb.append(((this.isfamily == null)?"<null>":this.isfamily));
        sb.append(',');
        sb.append("isPrimary");
        sb.append('=');
        sb.append(((this.isPrimary == null)?"<null>":this.isPrimary));
        sb.append(',');
        sb.append("hasComment");
        sb.append('=');
        sb.append(((this.hasComment == null)?"<null>":this.hasComment));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.server == null)? 0 :this.server.hashCode()));
        result = ((result* 31)+((this.ispublic == null)? 0 :this.ispublic.hashCode()));
        result = ((result* 31)+((this.isfriend == null)? 0 :this.isfriend.hashCode()));
        result = ((result* 31)+((this.isPrimary == null)? 0 :this.isPrimary.hashCode()));
        result = ((result* 31)+((this.farm == null)? 0 :this.farm.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.hasComment == null)? 0 :this.hasComment.hashCode()));
        result = ((result* 31)+((this.isfamily == null)? 0 :this.isfamily.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Photo) == false) {
            return false;
        }
        Photo rhs = ((Photo) other);
        return ((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.server == rhs.server)||((this.server!= null)&&this.server.equals(rhs.server))))&&((this.ispublic == rhs.ispublic)||((this.ispublic!= null)&&this.ispublic.equals(rhs.ispublic))))&&((this.isfriend == rhs.isfriend)||((this.isfriend!= null)&&this.isfriend.equals(rhs.isfriend))))&&((this.isPrimary == rhs.isPrimary)||((this.isPrimary!= null)&&this.isPrimary.equals(rhs.isPrimary))))&&((this.farm == rhs.farm)||((this.farm!= null)&&this.farm.equals(rhs.farm))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.hasComment == rhs.hasComment)||((this.hasComment!= null)&&this.hasComment.equals(rhs.hasComment))))&&((this.isfamily == rhs.isfamily)||((this.isfamily!= null)&&this.isfamily.equals(rhs.isfamily))));
    }

}
