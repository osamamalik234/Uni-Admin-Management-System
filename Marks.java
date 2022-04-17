package com.company;

import java.awt.*;

import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

    JTextArea textArea;
    JPanel panel;

    Marks(){}
    Marks(String str){
        setSize(500,600);
        setLayout(new BorderLayout());

        panel = new JPanel();


        textArea = new JTextArea(50,15);
        JScrollPane jsp = new JScrollPane(textArea);
        textArea.setFont(new Font("Senserif",Font.ITALIC,18));
        textArea.setBackground(Color.CYAN);
        textArea.setForeground(Color.BLUE);

        add(panel,"North");

        add(jsp,"Center");

        setLocationRelativeTo(null);
        mark(str);
    }

    public void mark(String s){
        try{
            sqlConnecter c = new sqlConnecter();

            textArea.append("\tResult of Examination\n\n");
            textArea.append("*****************************************************\n");
            textArea.append("\tSubject\tMarks");
            textArea.append("\n*****************************************************");

            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno="+s);

            int marks1 =0, marks2=0 , marks3=0 , marks4=0 , marks5=0 , total_marks=0;
            double perc = 0.0;
            if(rs2.next()){

                 marks1 = Integer.parseInt(rs2.getString("marks1"));
                 marks2 = Integer.parseInt(rs2.getString("marks2"));
                 marks3 = Integer.parseInt(rs2.getString("marks3"));
                 marks4 = Integer.parseInt(rs2.getString("marks4"));
                 marks5 = Integer.parseInt(rs2.getString("marks5"));
                 total_marks = marks1+marks2+marks3+marks4+marks5;
                 perc =(double) (total_marks*100)/500;
            }
            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno="+s);

            if(rs1.next()){
                textArea.append("\n\t"+rs1.getString("subject1")+"\t"+marks1);
                textArea.append("\n\t"+rs1.getString("subject2")+"\t"+marks2);
                textArea.append("\n\t"+rs1.getString("subject3")+"\t"+marks3);
                textArea.append("\n\t"+rs1.getString("subject4")+"\t"+marks4);
                textArea.append("\n\t"+rs1.getString("subject5")+"\t"+marks5);
                textArea.append("\n*****************************************************");
                textArea.append("\n");
                textArea.append("\n");
                textArea.append("Total Marks\t");
                textArea.append(total_marks+" / 500");
                textArea.append("\n\nPercentage\t"+perc + "%");

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new Marks().setVisible(true);
    }
}