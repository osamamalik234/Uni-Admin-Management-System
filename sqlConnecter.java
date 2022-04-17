package com.company;
import java.sql.*;

public class sqlConnecter {
    Connection c;
    Statement s;
    public sqlConnecter(){
        try{
            //    Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
            s =c.createStatement();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new sqlConnecter();
    }
}
