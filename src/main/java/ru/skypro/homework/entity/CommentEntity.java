package ru.skypro.homework.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class CommentEntity {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk;
    private Integer author;
    @Column(name="created_at")
    private Long createdAt;
    private String authorFirstName;
    private String authorImage;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "ad_id",nullable = false)
    private Ad ad;

    public CommentEntity(Integer author, Long createdAt, String authorFirstName, String authorImage, String text) {
        this.author = author;
        this.createdAt = createdAt;
        this.authorFirstName = authorFirstName;
        this.authorImage = authorImage;
        this.text = text;
    }

}
