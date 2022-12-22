package ui;

import javax.swing.*;
import java.awt.*;

public class UniversityPortal {

    JFrame frame;
    JPanel mainPanel;
    JLabel welcome;
    JTextField userName;
    JTextField passWord;
    JTextField name;
    JTextField newUser;
    JTextField newPass;
    JLabel enterUsername;
    JLabel enterPassword;
    JLabel courseID;
    JLabel courseName;
    JLabel enterName;
    JLabel instructor;
    JLabel time;
    JLabel currentTime;
    JLabel seatsAvailable;


    public UniversityPortal() {
        frame = new JFrame();
        mainPanel = new JPanel();
        mainPage();
        mainPanel.setVisible(true);
        frame.setVisible(true);
    }

    public void mainPage() {
        mainPanel.setBackground(new Color(133, 164, 143, 255));
        welcome = new JLabel("Welcome");
        mainPanel.add(welcome);


    }

    public void loginToMyPage() {

    }

}
