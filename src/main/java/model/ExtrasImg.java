package model;

import jakarta.persistence.*;

@Entity
@Table(name="ExtrasImg")
public class ExtrasImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long extrasImgId;
    private String imgURL;

    // Getters y setters
    public Long getExtrasImgId() {
        return extrasImgId;
    }

    public void setExtrasImgId(Long extrasImgId) {
        this.extrasImgId = extrasImgId;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}

