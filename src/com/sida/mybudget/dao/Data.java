/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.dao;

import com.sida.mybudget.entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DungNA
 */
public class Data {

    private static final String baseURL = "http://anhdung.net/swe/";
    private static Connection conn;
    private static User user;

    public static String getBaseURL() {
        return baseURL;
    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        Data.user = user;
    }

    public static Connection getConn() {
        return conn;
    }

    public static Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://gator3028.hostgator.com:3306/ngodoan_swe?zeroDateTimeBehavior=convertToNull&autoReconnect=true";
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
