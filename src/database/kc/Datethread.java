/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database.kc;
import java.util.Date;
/**
 *
 * @author BRIAN
 */
public class Datethread extends Thread {
    private Date d1;
    public Datethread (String d1){
       d1 = ""+this.d1;
      
    }
    public void run (){
        String date;
        Date d2;
        try {
           d2 = new Date();
            Thread.sleep(60);
            date = ""+d2;
            
            
        } catch (Exception e) {
        }
       
    }
}