package com.sida.mybudget.dao;

import com.sida.mybudget.bo.BGToolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNA
 */
public class RegisterDAO {

    public static boolean Register(String name, String user, String email, String pass, int gender) throws SQLException, Exception {
        pass = BGToolkit.md5(pass);
        PreparedStatement sql = Data.getConn().prepareStatement("SELECT * FROM users WHERE user=?");
        sql.setString(1, user);
        ResultSet rs = sql.executeQuery();
        if (rs.next()) {
            throw new Exception("Username is already taken");
        }

        sql = Data.getConn().prepareStatement("SELECT * FROM users WHERE email=?");
        sql.setString(1, email);
        rs = sql.executeQuery();
        if (rs.next()) {
            throw new Exception("Email is already taken");
        }

        sql = Data.getConn().prepareStatement("INSERT INTO users (name,user,email,pass,gender) VALUES (?,?,?,?,?)");
        sql.setString(1, name);
        sql.setString(2, user);
        sql.setString(3, email);
        sql.setString(4, pass);
        sql.setInt(5, gender);
        if(sql.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
    }

}
