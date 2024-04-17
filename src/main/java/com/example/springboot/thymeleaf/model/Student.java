package com.example.springboot.thymeleaf.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Student {
    @NotNull(message = "is required")
    @Size(min=1, message="is required")
    private String firstName;
    @NotNull(message="is required")
    @Size(min=1,message = "is required")
    private String lastName;

    private String country;
    private String gender;

    private String language;
    private List<String> operatingSystem;
    @Min(value=0, message = "must be greater than or equal to zero")
    @Max(value = 9, message="must be less than or equal to 9")
    private int subjects;

    public Student() {
    }

    public Student(String firstName, String lastName, String country, String gender, String language, List<String> operatingSystem, int subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.gender = gender;
        this.language = language;
        this.operatingSystem = operatingSystem;
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(List<String> operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", language='" + language + '\'' +
                ", operatingSystem='" + operatingSystem + '\''+
                ",subjects='"+subjects+'\''+

                '}';
    }
}
