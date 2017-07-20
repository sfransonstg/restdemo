package com.stgconsulting.sfranson.restdemo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "person_id")
    private Person person;

    private String studentId;

    public List<Course> getCourses() {
        return courses;
    }

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
