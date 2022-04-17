package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AddStudentData implements ActionListener{

    JFrame frame;
    JLabel name,father_name,age,date_of_birth,address,phone,email_id,student_details,matric_per,enter_per,house_No,roll_no,add_data,depart;
    JTextField nameTxt,fatherTxt,ageTxt,dobTxt,addressTxt,phoneTxt,emailTxt,matricTxt,enterTxt,houseTxt,rollNoTxt;
    JButton submit,cancel;
    JComboBox courseBox;

    public AddStudentData(){
        frame = new JFrame("Add Student");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        add_data=new JLabel();
        add_data.setBounds(0,0,900,700);
        add_data.setLayout(null);
        ImageIcon img = new ImageIcon("C:\\Users\\Dell\\University Admin Management System\\Picture\\3.jpg");
        Image i3 = img.getImage().getScaledInstance(1220, 700,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        add_data.setIcon(icc3);

        student_details = new JLabel("New Student Details");
        student_details.setBounds(320,30,500,50);
        student_details.setFont(new Font("serif",Font.ITALIC,25));
        student_details.setForeground(Color.black);
        add_data.add(student_details);
        frame.add(add_data);


        name = new JLabel("Name");
        name.setBounds(50,150,100,30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(name);

        nameTxt=new JTextField();
        nameTxt.setBounds(200,150,150,30);
        add_data.add(nameTxt);

        father_name = new JLabel("Father's Name");
        father_name.setBounds(400,150,200,30);
        father_name.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(father_name);

        fatherTxt=new JTextField();
        fatherTxt.setBounds(600,150,150,30);
        add_data.add(fatherTxt);

        age= new JLabel("Age");
        age.setBounds(50,200,100,30);
        age.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(age);

        ageTxt=new JTextField();
        ageTxt.setBounds(200,200,150,30);
        add_data.add(ageTxt);

        date_of_birth= new JLabel("DOB (dd/mm/yyyy)");
        date_of_birth.setBounds(400,200,200,30);
        date_of_birth.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(date_of_birth);

        dobTxt=new JTextField();
        dobTxt.setBounds(600,200,150,30);
        add_data.add(dobTxt);

        address= new JLabel("Address");
        address.setBounds(50,250,100,30);
        address.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(address);

        addressTxt=new JTextField();
        addressTxt.setBounds(200,250,150,30);
        add_data.add(addressTxt);

        phone= new JLabel("Phone");
        phone.setBounds(400,250,100,30);
        phone.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(phone);

        phoneTxt=new JTextField();
        phoneTxt.setBounds(600,250,150,30);
        add_data.add(phoneTxt);

        email_id= new JLabel("Email Id");
        email_id.setBounds(50,300,100,30);
        email_id.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(email_id);

        emailTxt=new JTextField();
        emailTxt.setBounds(200,300,150,30);
        add_data.add(emailTxt);

        matric_per= new JLabel("Class X(%)");
        matric_per.setBounds(400,300,130,30);
        matric_per.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(matric_per);

        matricTxt=new JTextField();
        matricTxt.setBounds(600,300,150,30);
        add_data.add(matricTxt);

        enter_per= new JLabel("Class XII(%)");
        enter_per.setBounds(50,350,130,30);
        enter_per.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(enter_per);

        enterTxt=new JTextField();
        enterTxt.setBounds(200,350,150,30);
        add_data.add(enterTxt);


        house_No= new JLabel("House No");
        house_No.setBounds(400,350,100,30);
        house_No.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(house_No);

        houseTxt=new JTextField();
        houseTxt.setBounds(600,350,150,30);
        add_data.add(houseTxt);

        roll_no= new JLabel("Roll No");
        roll_no.setBounds(50,400,150,30);
        roll_no.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(roll_no);

        rollNoTxt=new JTextField();
        rollNoTxt.setBounds(200,400,150,30);

        add_data.add(rollNoTxt);

        depart=new JLabel("Department");
        depart.setBounds(400,400,150,30);
        depart.setFont(new Font("serif",Font.BOLD,20));
        add_data.add(depart);

        String course[] = {"Mechanical" , "Software" , "Civil" , "Electrical", "English",
                "Mathematics", "CRP"};

        courseBox = new JComboBox(course);
        courseBox.setBackground(Color.WHITE);
        courseBox.setBounds(600,400,150,30);
        add_data.add(courseBox);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,550,150,40);
        submit.setFocusable(false);

        add_data.add(submit);

        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(450,550,150,40);
        cancel.setFocusable(false);
        add_data.add(cancel);

        submit.addActionListener(this);
        cancel.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(900,700);
        frame.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae){

        String name = nameTxt.getText();
        String fName = fatherTxt.getText();
        String  age = ageTxt.getText();
        String dob = dobTxt.getText();
        String address = addressTxt.getText();
        String phone = phoneTxt.getText();
        String email = emailTxt.getText();
        String matricPer = matricTxt.getText();
        String enterPer= enterTxt.getText();
        String houseNo = houseTxt.getText();
        String rollno = rollNoTxt.getText();
        String depart = (String)courseBox.getSelectedItem();


        if(ae.getSource() == submit){
            try{
                sqlConnecter cc = new sqlConnecter();
                String q = "insert into student values('"+name+"','"+fName+"','"+age+"','"+dob+"','"+address+
                        "','"+phone+"','"+email+"'" +",'"+matricPer+"','"+enterPer+"','"+houseNo+"','"+
                        rollno+"','"+depart+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                frame.setVisible(false);
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
                ee.printStackTrace();
            }
        }else if(ae.getSource() == cancel){
            frame.setVisible(false);
            new FrontPage().setVisible(true);

        }
    }
    public static void main(String[ ] arg){
        new AddStudentData().frame.setVisible(true);
    }
}


//import javax.swing.*;
//import java.awt.*;
//
//public class AddStudentData extends JFrame{
//    Container c;
//    JLabel backgroundImage;
//    ImageIcon image;
//    JLabel name;
//    AddStudentData(){
//        setTitle("Login Page");
//        setSize(700,600);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        c = getContentPane();
//        c.setLayout(null);
//
//        image = new ImageIcon("C:\\Users\\j c\\IdeaProjects\\University Management\\Picture\\4.jpg");
//
//        Image img = image.getImage();
//        Image imgtemp = img.getScaledInstance(700,600,Image.SCALE_SMOOTH);
//        image = new ImageIcon(imgtemp);
//
//        backgroundImage = new JLabel("" , image,JLabel.CENTER);
//        backgroundImage.setBounds(0,0,700,600);
//
//        Font font = new Font("Cambria", Font.BOLD, 20);
//        name = new JLabel("Name: ");
//        name.setBounds(20,100,100,30);
//        name.setFont(font);
//        c.add(name);
//        c.add(backgroundImage);
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new AddStudentData();
//    }
//}

