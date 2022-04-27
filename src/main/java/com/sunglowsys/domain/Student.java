package com.sunglowsys.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    @Autowired
    private Address address;

    public Student() {
        System.out.println("student object is created ");
    }

    public Student(String firstName, String lastName, String email, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void newAddress() {

        address.checkAddress();
    }
}
