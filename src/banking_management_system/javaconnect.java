/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_management_system;
 

/*
 *
 *
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
      System.out.print("Connection established");
      
    }
    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:F:\\database\\bank.sqlite");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);//import javax.swing.JOptionPane
        }
        return null;
    }
    
}
