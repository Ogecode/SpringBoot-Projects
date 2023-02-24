package com.ogbonnaya.project8;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String telephoneNo;

    public Student(String firstName, String lastName, String email, String telephoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephoneNo = telephoneNo;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }


}
