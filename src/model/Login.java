package model;

public class Login {

    private Student student;
    private String username;
    private String password;

    public Login(Student student, String username, String password) {
        this.student = student;
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Student getStudent() {
        return student;
    }


}
