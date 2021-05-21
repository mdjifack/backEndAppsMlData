package com.backend.mldataBackend.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "CONTACT")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRSTNAME")
    @NotBlank
    @Size(max = 40)
    private String firstname;

    @Column(name = "LASTNAME")
    @NotBlank
    @Size(max = 60)
    private String lastname;

    @Column(name = "EMAIL")
    @NotBlank
    @Size(max = 40)
    private String email;

    @Column(name = "NEED")
    @Enumerated(EnumType.STRING)
    private NeedEnum need;
    private String message;

    @Column(name = "MESSAGE")
    @NotBlank
    @Size(max = 300)


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NeedEnum getNeed() {
        return need;
    }

    public void setNeed(NeedEnum need) {
        this.need = need;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
