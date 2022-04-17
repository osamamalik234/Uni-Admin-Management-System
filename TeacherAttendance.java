package com.company;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeacherAttendance extends JFrame implements ActionListener {

    JLabel l1, emp_id;
    JButton b1, b2;
    Choice c2, fh, sh;

    TeacherAttendance() {

        setTitle("Teacher Attendance");
        setLayout(null);

        c2 = new Choice();
        try {
            sqlConnecter c = new sqlConnecter();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while (rs.next()) {
                c2.add(rs.getString("empId"));
            }
        } catch (Exception e) {
        }

        c2.setBounds(250, 65, 200, 50);

        emp_id = new JLabel("Select Employee Id");
        emp_id.setBounds(50, 50, 200, 50);
        emp_id.setFont(new Font("serif", Font.BOLD, 20));

        add(c2);

        l1 = new JLabel("Attendance");
        l1.setBounds(50, 200, 100, 50);
        l1.setFont(new Font("serif", Font.BOLD, 20));

        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");

        fh.setBounds(250, 215, 200, 50);

        add(emp_id);
        add(l1);
        add(fh);


        b1 = new JButton("Submit");
        b1.setBounds(50, 300, 100, 50);

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");
        b2.setBounds(300, 300, 100, 50);

        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        getContentPane().setBackground(Color.ORANGE);

        setVisible(true);
        setSize(500, 400);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae) {

        String attendance = fh.getSelectedItem();
        String date = new java.util.Date().toString();
        String rollno = c2.getSelectedItem();
        String qry = "insert into teacher_attendance values(" + rollno + ",'" + date + "','" + attendance + "')";

        if (ae.getSource() == b1) {
            try {
                sqlConnecter c1 = new sqlConnecter();
                c1.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null, "Attendance confirmed");
                this.setVisible(false);
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, "Duplicate value is not allowed.");
            }
        } else if (ae.getSource() == b2) {
            new FrontPage().setVisible(true);
        }
    }

    public static void main(String s[]) {
        new TeacherAttendance();
    }
}
