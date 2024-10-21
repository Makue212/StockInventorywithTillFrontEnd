/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.kc;
import java.sql.Connection;
import java.sql.*;
import java.util.HashSet;
import database.kc.jFrameLogin;
/**
 *
 * @author BRIAN
 */
public class DatabaseKC {
public static Connection con;
public static String  dbFile = "C:\\Users\\BRIAN\\Documents\\Restaurant" ;
public static String dbUrl1 = "jdbc:ucanaccess://" + dbFile + "memory = true";
public static Connection getConnection(){
    try {
        con = DriverManager.getConnection(dbUrl1, "", "");
        System.out.println("Conection is a success .......");
    } catch (Exception e) {
        System.out.println("Something went wrong" + e);
    }
    return con;
}
public static Connection con2;
public static String dbFile2 = "C:\\Users\\BRIAN\\Documents\\tailorz.mdb";
public static String dbUrl2 = "jdbc:ucanaccess:// " + dbFile2 + "memory = true";
public static Connection getConnection1(){
    try {
        con2 = DriverManager.getConnection(dbUrl2, "", "");
    } catch (Exception e) {
        System.out.println("" + e);
    }
    return con2;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJFrame h = new NewJFrame();
        h.setVisible(true);
        h.setDefaultCloseOperation(NewJFrame.EXIT_ON_CLOSE);
     
        
        Thread  th = new Thread(){
            
        @Override
        public void run(){
            int b = 1;
            try {
                for( b=1;
                        b<=100;
                        b=b+1){
                    Thread.sleep(98);
                    h.bar3.abc(b);
                    h.bar3.repaint();
                    if(b == 100){
           h.setVisible(false);
           jFrameLogin h1 = new jFrameLogin();
           h1.setVisible(true);
           
              
            }
            else{
            
        }
                }
                
            } catch (Exception e) {
                System.out.println(""+e);
            }
            
        }
    };
    th.start();
   
        
    }
    }
    

