package model;

import jakarta.persistence.*;

@Entity
@Table(name="ContactMe")
public class ContactMe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contactId;
    private String contactText;
    private String formNamePlaceholder;
    private String formEmailPlaceholder;
    private String formMessagePlaceholder;

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getContactText() {
        return contactText;
    }

    public void setContactText(String contactText) {
        this.contactText = contactText;
    }

    public String getFormNamePlaceholder() {
        return formNamePlaceholder;
    }

    public void setFormNamePlaceholder(String formNamePlaceholder) {
        this.formNamePlaceholder = formNamePlaceholder;
    }

    public String getFormEmailPlaceholder() {
        return formEmailPlaceholder;
    }

    public void setFormEmailPlaceholder(String formEmailPlaceholder) {
        this.formEmailPlaceholder = formEmailPlaceholder;
    }

    public String getFormMessagePlaceholder() {
        return formMessagePlaceholder;
    }

    public void setFormMessagePlaceholder(String formMessagePlaceholder) {
        this.formMessagePlaceholder = formMessagePlaceholder;
    }
}

