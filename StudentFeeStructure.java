package com.company;

import javax.swing.*;
import java.awt.*;

public class StudentFeeStructure extends JFrame{

    JLabel programLbl,BElbl,BsLbl,CRPLbl,semester1,semester2,semester3,semester4,semester5,semester6,semester7,semester8;
    JLabel feeStructureLbl;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb13,bb14,bb17,bb18;
    JLabel crp7, crp8, bs7, bs8;

    public StudentFeeStructure(){

        setTitle("View Fee Structure");
        setSize(850,680);
        setLocationRelativeTo(null);
        setLayout(null);

        feeStructureLbl = new JLabel("Fee Structure");
        feeStructureLbl.setFont(new Font("serif",Font.ITALIC,56));
        feeStructureLbl.setBounds(250,10,400,70);
        add(feeStructureLbl);

        programLbl = new JLabel("Program");
        programLbl.setBounds(80,100,100,40);
        programLbl.setFont(new Font("serif",Font.BOLD,26));
        add(programLbl);

        // BE program
        BElbl = new JLabel("BE");
        BElbl.setBounds(280,100,100,40);
        BElbl.setFont(new Font("serif",Font.BOLD,26));
        add(BElbl);

        // BS program
        BsLbl = new JLabel("BS");
        BsLbl.setBounds(480,100,100,40);
        BsLbl.setFont(new Font("serif",Font.BOLD,26));
        add(BsLbl);

        // B-CRP
        CRPLbl = new JLabel("B-CRP");
        CRPLbl.setBounds(680,100,100,40);
        CRPLbl.setFont(new Font("serif",Font.BOLD,26));
        add(CRPLbl);
        // Semester
        semester1 = new JLabel("Semester 1");
        semester1.setBounds(80,180,150,40);
        semester1.setFont(new Font("serif",Font.BOLD,20));
        add(semester1);

        semester2 = new JLabel("Semester 2");
        semester2.setBounds(80,240,150,40);
        semester2.setFont(new Font("serif",Font.BOLD,20));
        add(semester2);

        semester3 = new JLabel("Semester 3");
        semester3.setBounds(80,300,150,40);
        semester3.setFont(new Font("serif",Font.BOLD,20));
        add(semester3);

        semester4 = new JLabel("Semester 4");
        semester4.setBounds(80,360,150,40);
        semester4.setFont(new Font("serif",Font.BOLD,20));
        add(semester4);

        semester5 = new JLabel("Semester 5");
        semester5.setBounds(80,420,150,40);
        semester5.setFont(new Font("serif",Font.BOLD,20));
        add(semester5);

        semester6= new JLabel("Semester 6");
        semester6.setBounds(80,480,150,40);
        semester6.setFont(new Font("serif",Font.BOLD,20));
        add(semester6);

        semester7 = new JLabel("Semester 7");
        semester7.setBounds(80,540,150,40);
        semester7.setFont(new Font("serif",Font.BOLD,20));
        add(semester7);

        semester8 = new JLabel("Semester 8");
        semester8.setBounds(80,600,150,40);
        semester8.setFont(new Font("serif",Font.BOLD,20));
        add(semester8);

        b1 = new JLabel("Rs 43000");
        b1.setBounds(280,180,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,20));
        add(b1);

        b2 = new JLabel("Rs 43000");
        b2.setBounds(280,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,20));
        add(b2);

        b3 = new JLabel("Rs 43000");
        b3.setBounds(280,300,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,20));
        add(b3);

        b4 = new JLabel("Rs 43000");
        b4.setBounds(280,360,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,20));
        add(b4);

        b5 = new JLabel("Rs 43000");
        b5.setBounds(280,420,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,20));
        add(b5);

        b6 = new JLabel("Rs 43000");
        b6.setBounds(280,480,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,20));
        add(b6);

        b7 = new JLabel("Rs 43000");
        b7.setBounds(280,540,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,20));
        add(b7);

        b8 = new JLabel("Rs 43000");
        b8.setBounds(280,600,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,20));
        add(b8);





        bb1 = new JLabel("Rs 32000");
        bb1.setBounds(480,180,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,20));
        add(bb1);

        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(480,240,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,20));
        add(bb2);

        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(480,300,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,20));
        add(bb3);

        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(480,360,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,20));
        add(bb4);

        bb17 = new JLabel("Rs 32000");
        bb17.setBounds(480,420,100,40);
        bb17.setFont(new Font("serif",Font.PLAIN,20));
        add(bb17);

        bb18 = new JLabel("Rs 32000");
        bb18.setBounds(480,480,100,40);
        bb18.setFont(new Font("serif",Font.PLAIN,20));
        add(bb18);

        bs7 = new JLabel("Rs 32000");
        bs7.setBounds(480,540,100,40);
        bs7.setFont(new Font("serif",Font.PLAIN,20));
        add(bs7);

        bs8 = new JLabel("Rs 32000");
        bs8.setBounds(480,600,100,40);
        bs8.setFont(new Font("serif",Font.PLAIN,20));
        add(bs8);


        // CRP Fee


        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(680,180,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,20));
        add(bb5);

        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(680,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,20));
        add(bb6);

        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(680,300,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,20));
        add(bb7);

        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(680,360,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,20));
        add(bb8);

        bb13 = new JLabel("Rs 25000");
        bb13.setBounds(680,420,150,40);
        bb13.setFont(new Font("serif",Font.PLAIN,20));
        add(bb13);

        bb14 = new JLabel("Rs 25000");
        bb14.setBounds(680,480,150,40);
        bb14.setFont(new Font("serif",Font.PLAIN,20));
        add(bb14);

        crp7 = new JLabel("Rs 25000");
        crp7.setBounds(680,540,150,40);
        crp7.setFont(new Font("serif",Font.PLAIN,20));
        add(crp7);

        crp8 = new JLabel("Rs 25000");
        crp8.setBounds(680,600,150,40);
        crp8.setFont(new Font("serif",Font.PLAIN,20));
        add(crp8);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args){
        new StudentFeeStructure().setVisible(true);
    }
}
