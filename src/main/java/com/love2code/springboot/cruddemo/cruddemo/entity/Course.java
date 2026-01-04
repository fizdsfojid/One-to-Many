package com.love2code.springboot.cruddemo.cruddemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Course")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE
                        , CascadeType.REFRESH,  CascadeType.DETACH})
    @JoinColumn(name = "instructor_id")
    @ToString.Exclude
    private instructor instructor;

    //ToString.Exludes - excludes sprcific line from to string method.


    public Course(String title) {
        this.title = title;
    }
}
