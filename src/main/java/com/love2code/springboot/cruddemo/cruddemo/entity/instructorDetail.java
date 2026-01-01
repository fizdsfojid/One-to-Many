package com.love2code.springboot.cruddemo.cruddemo.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

@Entity
@Table(name = "instructor_detail")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class instructorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "hobby")
    private String hobby;

    @Column(name = "youtube_channel")
    private String youtubeChannel;

    public instructorDetail(String hobby, String youtubeChannel) {
        this.hobby = hobby;
        this.youtubeChannel = youtubeChannel;
    }
}
