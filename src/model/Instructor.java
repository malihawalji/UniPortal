package model;

public class Instructor extends Staff {

    private String instructorName;
    private String instructorID;

    public Instructor(String instructorName, String instructorID) {
        this.instructorID = instructorID;
        this.instructorName = instructorName;
    }

    public String getInstructorID() {
        return instructorID;
    }

    public String getInstructorName() {
        return instructorName;
    }
}
