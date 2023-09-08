package com.example.f23comp1011s1w1;

public class Student {
    private String firstName, lastName, pathToImage;
    private int studentNum;

    public Student(String firstName, String lastName, String pathToImage, int studentNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pathToImage = pathToImage;
        this.studentNum = studentNum;
    }

    public Student(String firstName, String lastName, int studentNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNum(studentNum);
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][a-z]*"))
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("First name must have a capital letter followed by lower case letters");
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
}
