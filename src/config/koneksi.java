/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HELLO
 */
public class Koneksi {
    private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException {
        try{
            String url = "jdbc:mysql://localhost:3306/dbProjectSiswa";
            String user = "root";
            String pass = "root";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal = " + e.getMessage());
            System.out.println("Koneksi gagal = " + e.getMessage());
        }
        return mysqlconfig;
    }
    
    public static void main(String[] args) {
        try {
            configDB();
        } catch(SQLException e) {
            System.err.println("Gagal. cek lagi user/password/nama database");
        }
    }
}

