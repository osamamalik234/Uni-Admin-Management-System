package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TeacherDetails extends JFrame implements ActionListener{

    JLabel empIdLbl,addTeacherLbl;
    JTable table;
    JButton deleteBtn,addTeacherBtn,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address","Phone","Email","CGPA", "House No","Education","Department", "Employee Id"};
    String y[][] = new String[20][12];
    int i=0, j=0;

    TeacherDetails(){
        super("Teacher Details");
        setSize(1260,650);
        setLocationRelativeTo(null);
        setLayout(null);

        empIdLbl = new JLabel("Enter Employee id to delete Teacher : ");
        empIdLbl.setBounds(50,360,400,30);
        empIdLbl.setFont(new Font("serif",Font.BOLD,20));
        add(empIdLbl);

        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);

        deleteBtn = new JButton("Delete");
        deleteBtn.setBackground(Color.BLACK);
        deleteBtn.setForeground(Color.WHITE);
        deleteBtn.setBounds(620, 360, 100 ,30);
        add(deleteBtn);

        addTeacherLbl = new JLabel("Add New Teacher");
        addTeacherLbl.setBounds(50,450,400,30);
        addTeacherLbl.setFont(new Font("serif",Font.BOLD,20));
        add(addTeacherLbl);

        addTeacherBtn = new JButton("Add");
        addTeacherBtn.setBackground(Color.BLACK);
        addTeacherBtn.setForeground(Color.WHITE);
        addTeacherBtn.setBounds(300, 450, 150 ,30);
        add(addTeacherBtn);

        deleteBtn.addActionListener(this);
        addTeacherBtn.addActionListener(this);
//        b3.addActionListener(this);


        try{
            sqlConnecter c1  = new sqlConnecter();
            String s1 = "select * from teacher";
            ResultSet rs  = c1.s.executeQuery(s1);
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("fName");
                y[i][j++]=rs.getString("age");
                y[i][j++]=rs.getString("dob");
                y[i][j++]=rs.getString("address");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("cgpa");
                y[i][j++]=rs.getString("houseNo");
                y[i][j++]=rs.getString("education");
                y[i][j++]=rs.getString("department");
                y[i][j++]=rs.getString("empId");
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
                String a = t2.getText();
                String q = "delete from teacher where empId = '"+a+"'";
                c1.s.executeUpdate(q);
                this.setVisible(false);
                new TeacherDetails().setVisible(true);
            }catch(Exception e){}

        }else if(ae.getSource() == addTeacherBtn){
            new AddTeacherData().frame.setVisible(true);
//            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new TeacherDetails().setVisible(true);
    }

}

