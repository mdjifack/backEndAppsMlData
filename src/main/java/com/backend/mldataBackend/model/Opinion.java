package com.backend.mldataBackend.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "OPINION")
public class Opinion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "MESSAGE")
    @NotBlank
    @Size(max = 300)
    private String message;

    @Column(name = "SENTIMENET")
    @Enumerated(EnumType.STRING)
    private SentimentEnum sentiment;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SentimentEnum getSentiment() {
        return sentiment;
    }

    public void setSentiment(SentimentEnum sentiment) {
        this.sentiment = sentiment;
    }
}
