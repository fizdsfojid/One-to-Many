package com.love2code.springboot.cruddemo.cruddemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;
import org.springframework.data.repository.cdi.Eager;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private instructorDetail instructorDetail;

    @OneToMany(mappedBy = "instructor", fetch =FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE
                                                  ,CascadeType.REFRESH, CascadeType.DETACH})
    private List<Course> courses;

    public instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    //conviniance method for bi-derectional relationship
    public void addCourse(Course theCourse) {
        if(courses == null) {
            courses = new ArrayList<>();
        }
        courses.add(theCourse);

        theCourse.setInstructor(this);
    }
}
