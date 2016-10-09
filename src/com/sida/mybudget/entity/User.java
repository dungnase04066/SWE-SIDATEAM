/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.entity;

import com.sida.mybudget.bo.BGToolkit;
import com.sida.mybudget.dao.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DungNA
 */
public class User {

    private int uid;

    private String name;
    private String user;
    private String email;
    private String pass;
    private boolean gender;

    public User() {
    }

    public User(int uid, String name, String user, String email, String pass, boolean gender) {
        this.uid = uid;
        this.name = name;
        this.user = user;
        this.email = email;
        this.pass = pass;
        this.gender = gender;
    }

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    private void reGetData() {
        try {
            Statement sta = Data.getConn().createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM users WHERE uid=" + Integer.toString(this.uid));
            if (rs.next()) {
                User userdb = new User(rs.getInt("uid"), rs.getString("name"), rs.getString("user"), rs.getString("email"), rs.getString("pass"), rs.getBoolean("gender"));
                Data.setUser(userdb);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Lost!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean update(String name, String email, boolean gender, String newPass, String currentPass) throws SQLException, Exception {
        currentPass = BGToolkit.md5(currentPass);
        if (!currentPass.equals(this.pass)) {
            throw new Exception("Current password is incorrect");
        }
        String sql = "UPDATE users SET user='" + this.user + "'";
        if (!name.equals(this.name)) {
            sql += ",name='" + name + "'";
        }

        if (!email.equals(this.email)) {
            PreparedStatement esql = Data.getConn().prepareStatement("SELECT * FROM users WHERE email=?");
            esql.setString(1, email);
            ResultSet rs = esql.executeQuery();
            if (rs.next()) {
                throw new Exception("Email is already taken");
            }
            sql += ",email='" + email + "'";
        }
        if (gender != this.gender) {
            sql += ",gender=" + (gender ? "1" : "0");
        }
        if (!newPass.equals("")) {
            sql += ",pass='" + BGToolkit.md5(newPass) + "'";
        }
        sql += " WHERE uid=" + Integer.toString(this.uid);
        Statement sta = Data.getConn().createStatement();
        int execute = sta.executeUpdate(sql);
        if (execute > 0) {
            reGetData();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", name=" + name + ", user=" + user + ", email=" + email + ", pass=" + pass + ", gender=" + gender + '}';
    }

}
