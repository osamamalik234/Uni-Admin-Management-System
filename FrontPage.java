package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrontPage extends JFrame implements ActionListener {

    Container c;
    ImageIcon image;
    JLabel backgroundImage;

    FrontPage() {
        setTitle("University Management System");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        c = getContentPane();

        image = new ImageIcon("C:\\Users\\Dell\\University Admin Management System\\Picture\\2.jpg");

        Image img = image.getImage();
        Image imgtemp = img.getScaledInstance(1000, 700, Image.SCALE_SMOOTH);
        image = new ImageIcon(imgtemp);
        backgroundImage = new JLabel(image);

        Font font = new Font("Cambria", Font.BOLD, 20);

        JMenuBar menuBar = new JMenuBar();
        JMenu newMenu = new JMenu("New Data");
        newMenu.setFont(font);
        newMenu.setBackground(Color.WHITE);
        newMenu.setForeground(Color.BLUE);

        JMenuItem menuItem1 = new JMenuItem("New Faculty");
        menuItem1.setForeground(Color.BLACK);
        menuItem1.setBackground(Color.WHITE);
        menuItem1.addActionListener(this);

        JMenuItem menuItem2 = new JMenuItem("New Student Admission");
        menuItem2.setForeground(Color.BLACK);
        menuItem2.setBackground(Color.WHITE);
        menuItem2.addActionListener(this);

        JMenu newMenu1 = new JMenu("Details");
        newMenu1.setFont(font);
        newMenu1.setBackground(Color.WHITE);
        newMenu1.setForeground(Color.RED);

        JMenuItem menuItem3 = new JMenuItem("Student Details");
        menuItem3.setForeground(Color.BLACK);
        menuItem3.setBackground(Color.WHITE);
        menuItem3.addActionListener(this);

        JMenuItem menuItem4 = new JMenuItem("Teacher Details");
        menuItem4.setForeground(Color.BLACK);
        menuItem4.setBackground(Color.WHITE);
        menuItem4.addActionListener(this);

        JMenu newMenu2 = new JMenu("Attendance");
        newMenu2.setFont(font);
        newMenu2.setBackground(Color.WHITE);
        newMenu2.setForeground(Color.BLUE);

        JMenuItem menuItem5 = new JMenuItem("Student Attendance");
        menuItem5.setForeground(Color.BLACK);
        menuItem5.setBackground(Color.WHITE);
        menuItem5.addActionListener(this);

        JMenuItem menuItem6 = new JMenuItem("Teacher Attendance");
        menuItem6.setForeground(Color.BLACK);
        menuItem6.setBackground(Color.WHITE);
        menuItem6.addActionListener(this);

        JMenu newMenu3 = new JMenu("Attendance Details");
        newMenu3.setFont(font);
        newMenu3.setBackground(Color.WHITE);
        newMenu3.setForeground(Color.RED);

        JMenuItem menuItem7 = new JMenuItem("Student Attendance Details");
        menuItem7.setForeground(Color.BLACK);
        menuItem7.setBackground(Color.WHITE);
        menuItem7.addActionListener(this);

        JMenuItem menuItem8 = new JMenuItem("Teacher Attendance Details");
        menuItem8.setForeground(Color.BLACK);
        menuItem8.setBackground(Color.WHITE);
        menuItem8.addActionListener(this);
        // pp
        JMenu newMenu4 = new JMenu("Examination");
        newMenu4.setFont(font);
        newMenu4.setBackground(Color.WHITE);
        newMenu4.setForeground(Color.BLUE);

        JMenuItem menuItem9 = new JMenuItem("Examination Details");
        menuItem9.setForeground(Color.BLACK);
        menuItem9.setBackground(Color.WHITE);
        menuItem9.addActionListener(this);

        JMenuItem menuItem10 = new JMenuItem("Enter Marks");
        menuItem10.setForeground(Color.BLACK);
        menuItem10.setBackground(Color.WHITE);
        menuItem10.addActionListener(this);

        //pp
        JMenu newMenu5 = new JMenu("Student Fee");
        newMenu5.setFont(font);
        newMenu5.setBackground(Color.WHITE);
        newMenu5.setForeground(Color.RED);

        JMenuItem menuItem11 = new JMenuItem("Student Fee Form");
        menuItem11.setForeground(Color.BLACK);
        menuItem11.setBackground(Color.WHITE);
        menuItem11.addActionListener(this);

        JMenuItem menuItem12 = new JMenuItem("Student Fee Structure");
        menuItem12.setForeground(Color.BLACK);
        menuItem12.setBackground(Color.WHITE);
        menuItem12.addActionListener(this);

        JMenu newMenu6 = new JMenu("Exit");
        newMenu6.setFont(font);
        newMenu6.setBackground(Color.WHITE);
        newMenu6.setForeground(Color.blue);

        JMenuItem menuItem13 = new JMenuItem("Exit");
        menuItem13.setForeground(Color.BLACK);
        menuItem13.setBackground(Color.WHITE);
        menuItem13.addActionListener(this);


        newMenu.add(menuItem1);
        newMenu.add(menuItem2);
        newMenu1.add(menuItem3);
        newMenu1.add(menuItem4);
        newMenu2.add(menuItem5);
        newMenu2.add(menuItem6);
        newMenu3.add(menuItem7);
        newMenu3.add(menuItem8);
        newMenu4.add(menuItem9);
        newMenu4.add(menuItem10);
        newMenu5.add(menuItem11);
        newMenu5.add(menuItem12);
        newMenu6.add(menuItem13);

        menuBar.add(newMenu);
        menuBar.add(newMenu1);
        menuBar.add(newMenu2);
        menuBar.add(newMenu3);
        menuBar.add(newMenu4);
        menuBar.add(newMenu5);
        menuBar.add(newMenu6);

        setJMenuBar(menuBar);

        c.setLayout(new FlowLayout());
        // c.setLayout(new BorderLayout());
        c.add(backgroundImage);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrontPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if (msg.equals("New Student Admission")) {
            new AddStudentData().frame.setVisible(true);
        }
        else if(msg.equals("New Faculty")) {
            new AddTeacherData().frame.setVisible(true);
        }
        else if(msg.equals("Student Details")) {
            new StudentDetails().setVisible(true);
        }
        else if(msg.equals("Teacher Details")) {
            new TeacherDetails().setVisible(true);
        }
        else if(msg.equals("Student Attendance")) {
            new StudentAttendance().frame.setVisible(true);
        }
        else if(msg.equals("Teacher Attendance")){
            new TeacherAttendance().setVisible(true);
        }
        else if(msg.equals("Student Attendance Details")){
            new StudentAttendanceDetails().setVisible(true);
        }
        else if(msg.equals("Teacher Attendance Details")) {
            new TeacherAttendanceDetail().setVisible(true);
        }
        else if(msg.equals("Examination Details")) {
            new ExaminationDetails().setVisible(true);
        }
        else if(msg.equals("Enter Marks")) {
            new EnterMarks().setVisible(true);
        }
        else if(msg.equals("Student Fee Form")) {
            new StudentFeeForm().setVisible(true);
        }
        else if(msg.equals("Student Fee Structure")) {
            new StudentFeeStructure().setVisible(true);
        }
        else if(msg.equals("Exit")) {
            System.exit(0);
        }
    }
}
