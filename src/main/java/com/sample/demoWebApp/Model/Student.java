package com.sample.demoWebApp.Model;


import javax.persistence.*;

@Entity
@Table(name = "StudentDB")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    Integer id;

    @Column
    String name;

    @Column
    String grade;

    @Column
    double salary;

    @Column
    String gender;

    public Student() {
    }

    public Student(String name, String grade, double salary,String gender) {
        this.name = name;
        this.grade = grade;
        this.salary = salary;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
