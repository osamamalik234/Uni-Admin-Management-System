package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AddTeacherData implements ActionListener {

    JFrame frame;
    JLabel  name, father_Name, age, date_of_birth, address, phone, email_id, teacher_details,cgpa, house_no, emp_Id, add_data, education,  depart;
    JTextField nameTxt, fatherTxt, ageTxt, dobTxt, addressTxt, phoneTxt, emailTxt, cgpaTxt, houseTxt, empTxt;
    JButton submit, cancel;
    JComboBox educationBox, departBox;

    AddTeacherData() {
        frame = new JFrame("Add Teacher");
        frame.setBackground(Color.white);
        frame.setLayout(null);

        add_data= new JLabel();
        add_data.setBounds(0, 0, 900, 700);
        add_data.setLayout(null);
        ImageIcon img = new ImageIcon("C:\\Users\\Dell\\University Admin Management System\\Picture\\10.jpg");
        Image i3 = img.getImage().getScaledInstance(920, 600, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        add_data.setIcon(icc3);

        teacher_details = new JLabel("New Teacher Details");
        teacher_details.setBounds(320, 5, 500, 50);
        teacher_details.setFont(new Font("serif", Font.ITALIC, 25));
        teacher_details.setForeground(Color.black);
        add_data.add(teacher_details);
        frame.add(add_data);


        name= new JLabel("Name");
        name.setBounds(50, 150, 100, 30);
        name.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(name);


        nameTxt = new JTextField();
        nameTxt.setBounds(200, 150, 150, 30);
        add_data.add(nameTxt);

        father_Name = new JLabel("Father's Name");
        father_Name.setBounds(400, 150, 200, 30);
        father_Name.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(father_Name);

        fatherTxt = new JTextField();
        fatherTxt.setBounds(600, 150, 150, 30);
        add_data.add(fatherTxt);

        age = new JLabel("Age");
        age.setBounds(50, 200, 100, 30);
        age.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(age);

        ageTxt = new JTextField();
        ageTxt.setBounds(200, 200, 150, 30);
        add_data.add(ageTxt);

        date_of_birth = new JLabel("DOB (dd/mm/yyyy)");
        date_of_birth.setBounds(400, 200, 200, 30);
        date_of_birth.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(date_of_birth);

        dobTxt = new JTextField();
        dobTxt.setBounds(600, 200, 150, 30);
        add_data.add(dobTxt);

        address = new JLabel("Address");
        address.setBounds(50, 250, 100, 30);
        address.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(address);

        addressTxt = new JTextField();
        addressTxt.setBounds(200, 250, 150, 30);
        add_data.add(addressTxt);

        phone = new JLabel("Phone");
        phone.setBounds(400, 250, 100, 30);
        phone.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(phone);

        phoneTxt = new JTextField();
        phoneTxt.setBounds(600, 250, 150, 30);
        add_data.add(phoneTxt);

        email_id = new JLabel("Email Id");
        email_id.setBounds(50, 300, 100, 30);
        email_id.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(email_id);

        emailTxt = new JTextField();
        emailTxt.setBounds(200, 300, 150, 30);
        add_data.add(emailTxt);

        cgpa = new JLabel("CGPA");
        cgpa.setBounds(400, 300, 130, 30);
        cgpa.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(cgpa);

        cgpaTxt = new JTextField();
        cgpaTxt.setBounds(600, 300, 150, 30);
        add_data.add(cgpaTxt);

        house_no= new JLabel("House No");
        house_no.setBounds(400, 350, 100, 30);
        house_no.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(house_no);

        houseTxt = new JTextField();
        houseTxt.setBounds(600, 350, 150, 30);
        add_data.add(houseTxt);


        education = new JLabel("Education");
        education.setBounds(50, 400, 150, 30);
        education.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(education);

        String course[] = {"BE", "BS", "ME", "MS", "M-Phil", "PHD"};
        educationBox = new JComboBox(course);
        educationBox.setBackground(Color.WHITE);
        educationBox.setBounds(200, 400, 150, 30);
        add_data.add(educationBox);

        depart = new JLabel("Department");
        depart.setBounds(400, 400, 150, 30);
        depart.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(depart);

        String branch[] = {"Computer Science", "Electronics", "Electrical", "Mechanical", "Civil", "Software"};
        departBox = new JComboBox(branch);
        departBox.setBackground(Color.WHITE);
        departBox.setBounds(600, 400, 150, 30);
        add_data.add(departBox);

        emp_Id = new JLabel("Emp id");
        emp_Id.setBounds(50, 350, 130, 30);
        emp_Id.setFont(new Font("serif", Font.BOLD, 20));
        add_data.add(emp_Id);

        empTxt = new JTextField();
        empTxt.setBounds(200, 350, 150, 30);
        add_data.add(empTxt);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250, 550, 150, 40);

        add_data.add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(450, 550, 150, 40);

        add_data.add(cancel);

        submit.addActionListener(this);
        cancel.addActionListener(this);

        frame.setVisible(true);
        frame.setSize(900, 700);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae) {

        String name = nameTxt.getText();
        String fName = fatherTxt.getText();
        String age = ageTxt.getText();
        String dob = dobTxt.getText();
        String address = addressTxt.getText();
        String phone = phoneTxt.getText();
        String email = emailTxt.getText();
        String cgpa = cgpaTxt.getText();
        String houseNo = houseTxt.getText();
        String education = (String) educationBox.getSelectedItem();
        String department = (String) departBox.getSelectedItem();
        String empId = empTxt.getText();


        if (ae.getSource() == submit) {
            try {
                sqlConnecter cc = new sqlConnecter();
                String q = "insert into teacher values('" + name + "','" + fName + "','" + age + "','" + dob + "','" + address + "','" + phone + "','" + email
                        + "','" + cgpa + "','" + houseNo + "','" + education + "','" + department + "','" + empId + "')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted Successfully");
                frame.setVisible(false);

            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }
        } else if (ae.getSource() == cancel) {
            frame.setVisible(false);
            new FrontPage().setVisible(true);
        }
    }
    public static void main(String[] arg) {
        new AddTeacherData().frame.setVisible(true);
    }
}