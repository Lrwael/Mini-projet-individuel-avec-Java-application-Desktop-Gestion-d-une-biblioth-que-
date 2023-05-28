/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author waels
 */


//Connection con =JavaApplication1.mycon();



public class JavaApplication1 {
 public static Connection mycon(){
 
 
     Connection con = null ;
     
     try {
         
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/database","root","");
         //Statement st=con.createStatement();
         //String sql="insert into data values(4);";
         //st.executeUpdate(sql);
         return con;
         
         
     } catch (SQLException e) {
         
         System.out.println(e);
         return null;
     }
     catch(ClassNotFoundException x){
         System.err.println(x);
         return null;
     }
 }
    public static void main(String[] args) {
        mycon();
    }































}
