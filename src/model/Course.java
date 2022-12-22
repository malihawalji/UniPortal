package model;

import java.util.HashSet;
import java.util.Set;

public class Course {

    String courseName;
    String courseID;
    Instructor instructor;
    Set<Student> enrolledStudents;

    public Course(String courseName, String courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        enrolledStudents = new HashSet<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public Set<Student> getEnrolledStudents() {
        return this.enrolledStudents;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }


}
