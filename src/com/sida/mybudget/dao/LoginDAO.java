/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.dao;

import com.sida.mybudget.bo.BGToolkit;
import com.sida.mybudget.entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DungNA
 */
public class LoginDAO {
    
    public static boolean checkAccount(String user, String pass) throws SQLException {
        pass = BGToolkit.md5(pass);
        PreparedStatement sql = Data.getConn().prepareStatement("SELECT * FROM users WHERE user=? AND pass=?");
        sql.setString(1, user);
        sql.setString(2, pass);
        ResultSet rs = sql.executeQuery();
        if (rs.next()) {
            User userdb = new User(rs.getInt("uid"), rs.getString("name"), rs.getString("user"), rs.getString("email"), rs.getString("pass"), rs.getBoolean("gender"));
            Data.setUser(userdb);
            return true;
        } else {
            return false;
        }
    }
}
