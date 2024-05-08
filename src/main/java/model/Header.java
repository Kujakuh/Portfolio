package model;

import jakarta.persistence.*;

@Entity
@Table(name="Header")
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long headerId;
    private String welcomeText;
    private String name;

    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public void setWelcomeText(String welcomeText) {
        this.welcomeText = welcomeText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
