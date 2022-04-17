package com.company;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;


public class StudentAttendanceDetails extends JFrame implements ActionListener{

    JTable table;
    JButton b1;
    String h[]={"Roll Number","Sub1" , "Sub2" , "Sub3" , "Sub4" , "Sub5" , "Date"};
    String d[][]=new String[15][7];
    int i=0,j=0;

    StudentAttendanceDetails(){
        super("View Students Attendence");
        setSize(800,300);
        setLocation(450,150);
        setLocationRelativeTo(null);

        try{
            String q="select * from student_attendance";
            sqlConnecter c1=new sqlConnecter();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("rollno");
                d[i][j++]=rs.getString("sub1");
                d[i][j++]=rs.getString("sub2");
                d[i][j++]=rs.getString("sub3");
                d[i][j++]=rs.getString("sub4");
                d[i][j++]=rs.getString("sub5");
                d[i][j++]=rs.getString("date");
                i++;
                j=0;
            }

            table=new JTable(d,h);

        }catch(Exception e){}

        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(table);
        add(s1);

        b1.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ae){
        try{
            table.print();
        }catch(Exception e){}
    }

    public static void main(String[] args){
        new StudentAttendanceDetails().setVisible(true);
    }
}
