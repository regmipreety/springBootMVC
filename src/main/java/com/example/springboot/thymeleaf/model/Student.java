package com.example.springboot.thymeleaf.model;

import com.example.springboot.thymeleaf.interfaces.UserName;
import jakarta.validation.constraints.*;

import java.util.List;

public class Student {
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String firstName;
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    private String country;
    private String gender;

    private String language;
    private List<String> operatingSystem;
    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 9, message = "must be less than or equal to 9")
    @NotNull(message = "is required")
    private Integer subjects;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    @UserName(value = "CQU", message = "must start with CQU")
    private String username;

    public Student() {
    }

    public Student(String firstName, String lastName, String country, String gender, String language, List<String> operatingSystem, Integer subjects, String postalCode, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.gender = gender;
        this.language = language;
        this.operatingSystem = operatingSystem;
        this.subjects = subjects;
        this.postalCode = postalCode;
        this.username = username;
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

    public Integer getSubjects() {
        return subjects;
    }

    public void setSubjects(Integer subjects) {
        this.subjects = subjects;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", language='" + language + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ",subjects='" + subjects + '\'' +
                ",postalCode='" + postalCode + '\'' +
                ",username='" + username + '\'' +

                '}';
    }
}
