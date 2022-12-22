package model;

import java.util.Set;

public class CourseManagement {

    private Set<Course> courseSet;
    private static final CourseManagement courseManagement = new CourseManagement();

    private CourseManagement () {
        courseSet();
    }

    public CourseManagement getInstance() {
        return courseManagement;
    }

    private void courseSet() {
        Course CPSC210 = new Course("Software Construction", "CPSC210");
        Instructor instructorC210 = new Instructor("Steve", "123");
        CPSC210.setInstructor(instructorC210);

        Course CPSC110 = new Course("Computation & Programming", "CPSC110");
        Instructor instructorC110 = new Instructor("Anna", "234");
        CPSC110.setInstructor(instructorC110);

        Course ENGL110 = new Course("Approaches to Literature & Culture", "ENGL110");
        Instructor instructorE110 = new Instructor("Eric", "345");
        ENGL110.setInstructor(instructorE110);

        Course ENGL120 = new Course("Literature & Criticism", "ENGL120");
        Instructor instructorE120 = new Instructor("Angela", "456");
        ENGL120.setInstructor(instructorE120);

        Course CPSC213 = new Course("Intro to Computer Systems", "CPSC213");
        Instructor instructorC213 = new Instructor("Nabeel", "567");
        CPSC213.setInstructor(instructorC213);

        Course CPSC221 = new Course("Basic Algorithms & Data Structures", "CPSC221");
        Instructor instructorC221 = new Instructor("Katrina", "678");
        CPSC221.setInstructor(instructorC221);

        courseSet.add(CPSC210);
        courseSet.add(CPSC110);
        courseSet.add(ENGL110);
        courseSet.add(ENGL120);
        courseSet.add(CPSC213);
        courseSet.add(CPSC221);
    }

    public Set<Course> getCourseSet() {
        return courseSet;
    }

}
