package model;

import jakarta.persistence.*;

@Entity
@Table(name="WhoIsThisGuy")
public class WhoIsThisGuy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long whoIsThisGuyId;
    private String description;
    private String imageURL;

    public Long getWhoIsThisGuyId() {
        return whoIsThisGuyId;
    }

    public void setWhoIsThisGuyId(Long whoIsThisGuyId) {
        this.whoIsThisGuyId = whoIsThisGuyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
