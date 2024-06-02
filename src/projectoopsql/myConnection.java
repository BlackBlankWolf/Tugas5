/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectoopsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP VICTUS
 */
public class myConnection {
    public static Connection getConnection() throws SQLException{
        Connection con = null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseproject", "root", "Akmal12344");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    } 
}
