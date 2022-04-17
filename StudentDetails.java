package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener{

    JLabel rollnoLbl,addStudentLbl;
    JTable table;
    JButton deleteBtn,addStudentBtn;
    JTextField rollnoTxt;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","Class X(%)", "Class XII(%)", "House No","Roll No","Department"};
    String y[][] = new String[20][13];
    int i=0, j=0;
    StudentDetails(){
        super("Student Details");
        setSize(1260,650);
        setLocationRelativeTo(null);
        setLayout(null);

        rollnoLbl = new JLabel("Enter roll number to delete Student : ");
        rollnoLbl.setBounds(50,360,400,30);
        rollnoLbl.setFont(new Font("serif",Font.BOLD,20));
        add(rollnoLbl);

        rollnoTxt = new JTextField();
        rollnoTxt.setBounds(400,360,200,30);
        add(rollnoTxt);

        deleteBtn = new JButton("Delete");
        deleteBtn.setBackground(Color.BLACK);
        deleteBtn.setForeground(Color.WHITE);
        deleteBtn.setBounds(620, 360, 100 ,30);
        add(deleteBtn);

        addStudentLbl = new JLabel("Add New Student");
        addStudentLbl.setBounds(50,450,400,30);
        addStudentLbl.setFont(new Font("serif",Font.BOLD,20));
        add(addStudentLbl);

        addStudentBtn = new JButton("Add Student");
        addStudentBtn.setBackground(Color.BLACK);
        addStudentBtn.setForeground(Color.WHITE);
        addStudentBtn.setBounds(300, 450, 150 ,30);
        add(addStudentBtn);



        deleteBtn.addActionListener(this);
        addStudentBtn.addActionListener(this);
//        b3.addActionListener(this);


        try{
            sqlConnecter c1  = new sqlConnecter();
            String s1 = "select * from student";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fName");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("matricPer");
                y[i][j++]=rs.getString("enterPer");
                y[i][j++]=rs.getString("houseNO");
                y[i][j++]=rs.getString("rollno");
                y[i][j++]=rs.getString("depart");

                i++;
                j=0;
            }
            table = new JTable(y,x);

        }catch(Exception e){
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20,20,1200,330);
        add(sp);

        getContentPane().setBackground(Color.WHITE);

        deleteBtn.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){

        sqlConnecter c1 = new sqlConnecter();

        if(ae.getSource() == deleteBtn){
            try{
                String a = rollnoTxt.getText();
                String q = "delete from student where rollno = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }catch(Exception e){}

        }else if(ae.getSource() == addStudentBtn){
            new AddStudentData().frame.setVisible(true);
//            this.setVisible(false);
        }

    }
    public static void main(String[] args){
        new StudentDetails().setVisible(true);
    }

}