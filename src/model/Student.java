package model;

public class Student {

    String name;
    String studentID;
    int age;

    public Student(String name, String studentID, int age) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public int getAge() {
        return this.age;
    }



}
