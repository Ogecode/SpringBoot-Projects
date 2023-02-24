package com.Ogbonnaya.Springbootfirstapp;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String telephoneNo;
    private int age;

    public Student(String firstName, String lastName, String email, String telephoneNo, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephoneNo = telephoneNo;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
