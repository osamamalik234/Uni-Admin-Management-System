package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {


    ImageIcon image;
    JLabel backgroundImage;
    JLabel userName , password;
    JTextField userTxt;
    JPasswordField passTxt;
    JButton loginbtn , clearbtn;
    Container c;
     Login() {
        setTitle("Login Page");
        setSize(700,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        c = getContentPane();
        c.setLayout(null);

        image = new ImageIcon("C:\\Users\\Dell\\University Admin Management System\\Picture\\admin.jpg");

         Image img = image.getImage();
         Image imgtemp = img.getScaledInstance(700,600,Image.SCALE_SMOOTH);
         image = new ImageIcon(imgtemp);

         backgroundImage = new JLabel("" , image,JLabel.CENTER);
         backgroundImage.setBounds(0,0,700,600);

         Font font = new Font("Cambria", Font.BOLD, 20);

         userName = new JLabel("User Name: ");
         userName.setBounds(100 , 100 , 120 , 30);
         userName.setFont(font);

         userTxt = new JTextField();
         userTxt.setBounds(300,100 , 250 , 30);
         userName.setFont(font);


         password = new JLabel("Password: ");
         password.setBounds(100 , 200 , 120 , 30);
         password.setFont(font);

         passTxt = new JPasswordField();
         passTxt.setBounds(300 , 200 , 250 , 30);
         passTxt.setFont(font);

         loginbtn = new JButton("Login");
         loginbtn.setBounds(180 , 330 , 100 , 30);
         loginbtn.setFont(font);
         loginbtn.setBackground(Color.BLACK);
         loginbtn.setForeground(Color.white);
         loginbtn.addActionListener(this);
         loginbtn.setFocusable(false);

         clearbtn = new JButton("Clear");
         clearbtn.setBounds(350 , 330 , 100 , 30);
         clearbtn.setFont(font);
         clearbtn.setBackground(Color.BLACK);
         clearbtn.setForeground(Color.white);
         clearbtn.addActionListener(this);
         clearbtn.setFocusable(false);

         c.add(userName);
         c.add(password);
         c.add(userTxt);
         c.add(passTxt);
         c.add(loginbtn);
         c.add(clearbtn);
         c.add(backgroundImage);

         setResizable(false);
         setVisible(true);
    }

    private ImageIcon getImage() {
        return image;
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==loginbtn) {

             String userName = userTxt.getText();
             String password = passTxt.getText();
             if(userName.equals("Admin") && password.equals("muet20")) {
                 // JOptionPane.showMessageDialog(null , "User Name: "+userName+"\n\nPassword: "+password);
                 new FrontPage();
                 setVisible(false);

             }
             else
                 JOptionPane.showMessageDialog(null ,"Invalid login.....");
         }

         else {
             if(e.getSource()==clearbtn) {
               userTxt.setText("");
               passTxt.setText("");
             }
         }
    }
}
