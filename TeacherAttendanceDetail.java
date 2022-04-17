package com.company;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class TeacherAttendanceDetail extends JFrame implements ActionListener{

    JTable j1;
    JButton b1;
    String h[]={"Employee id","Date Time","Attendace"};
    String d[][]=new String[15][3];
    int i=0,j=0;

    TeacherAttendanceDetail(){
        super("View Teachers Attendance");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from teacher_attendance";
            sqlConnecter c1=new sqlConnecter();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("attendance");
                i++;
                j=0;
            }

            j1=new JTable(d,h);

        }catch(Exception e){}

        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1);
        add(s1);

        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new TeacherAttendanceDetail().setVisible(true);
    }
}