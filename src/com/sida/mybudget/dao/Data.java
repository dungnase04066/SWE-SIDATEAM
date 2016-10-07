/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DungNA
 */
public class Data {

    private static Connection conn;

    public static Connection getConn() {
        return conn;
    }

    public static Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://gator3028.hostgator.com:3306/ngodoan_swe?zeroDateTimeBehavior=convertToNull";
            String user = "ngodoan_swe";
            String pass = "?JE]QTINbIdr";
            conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Can't connect to server", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return null;
        }
    }
}
