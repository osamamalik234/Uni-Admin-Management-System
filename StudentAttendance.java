package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.Date;

public class StudentAttendance implements ActionListener {

    JFrame frame;
    JPanel northPanel, southPanel, centerPanel;
    JLabel dateLbl;
    Choice dept;
    JButton submit;
    JScrollPane pane;

    JTable record;
    String h[] = {"Roll Number", "Sub1", "Sub2", "Sub3", "Sub4", "Sub5"};
    String d[][] = new String[30][6];

    StudentAttendance() {

        frame = new JFrame();

        dateLbl = new JLabel();
        dateLbl.setText("" + new Date());
        dateLbl.setOpaque(true);
        dateLbl.setBackground(Color.GREEN);

        String[] course = {"Select Department", "Mechanical", "Software", "Civil", "Electrical", "English",
                "Mathematics", "CRP"};

        dept = new Choice();
        dept.addItemListener(new MyItemListener());

        for (int i = 0; i < course.length; i++)
            dept.add(course[i]);

        northPanel = new JPanel(new GridLayout(1, 2));

        northPanel.add(dateLbl);
        northPanel.add(dept);

        southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        submit = new JButton("Submit");
        submit.addActionListener(this);
        southPanel.add(submit);

        centerPanel = new JPanel(new BorderLayout());


        record = new JTable(d, h);

        pane = new JScrollPane(record);

        centerPanel.add(pane);

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {

        new StudentAttendance().frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == submit) {
            try {
                sqlConnecter c1 = new sqlConnecter();

                for (int i = 0; i < record.getRowCount(); i++) {

                    if (d[i][0].isEmpty())
                        break;

                    String qry = "insert into student_attendance values(" + d[i][0] + ",'" + dept.getSelectedItem()
                            + "','" + d[i][1] + "','" + d[i][2] + "','" + d[i][3]
                            + "','" + d[i][4] + "','" + d[i][5] + "','" + new Date() + "')";

                    c1.s.execute(qry);
                }

                JOptionPane.showMessageDialog(null, "Attendance confirmed");

            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Duplicate value is not allowed");
                System.out.println(e1);
            }
        }
    }

    class MyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {

            // To clear data from table
            for (int i = 0; i < record.getRowCount(); i++)
                for (int j = 0; j < record.getColumnCount(); j++)
                    d[i][j] = "";

            int i = 0, j = 0;

            try {

                String q = "select rollno from student where depart = '" + dept.getSelectedItem() + "'";
                sqlConnecter c1 = new sqlConnecter();
                ResultSet rs = c1.s.executeQuery(q);

                while (rs.next())
                    d[i++][j] = rs.getString("rollno");

                centerPanel.repaint();
                record = new JTable(d, h);
                pane = new JScrollPane(record);

            } catch (Exception e1) {
            }

        }
    }
}