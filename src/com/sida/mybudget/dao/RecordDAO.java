/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author small tiger
 */
public class RecordDAO {

    public static boolean addNew(String date, double amount, int type, String note) throws SQLException {
        PreparedStatement sql = Data.getConn().prepareStatement("INSERT INTO record (uid, date, amount, type, note) VALUES (?,?,?,?,?)");
        sql.setInt(1, Data.getUser().getUid());
        sql.setString(2, date);
        sql.setDouble(3, amount);
        sql.setInt(4, type);
        sql.setString(5, note);

        if (sql.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Vector getList() throws SQLException, SQLException {
        PreparedStatement sql = Data.getConn().prepareStatement("SELECT * FROM record WHERE uid = ?");
        sql.setInt(1, Data.getUser().getUid());
        System.out.println(sql);
        Vector<Vector> v = new Vector();
        ResultSet rs = sql.executeQuery();
        while (rs.next()) {
            Vector temp = new Vector();
            temp.add(rs.getInt("rid"));
            temp.add(rs.getInt("uid"));
            temp.add(rs.getDouble("amount"));
            temp.add(rs.getBoolean("type"));
            temp.add(rs.getString("date"));
            temp.add(rs.getString("note"));
            v.add(temp);
        }
        return v;
    }

    public static boolean delete(int id) throws SQLException {
        PreparedStatement sql = Data.getConn().prepareStatement("DELETE FROM record WHERE rid = ? AND  uid =?");
        sql.setInt(1, id);
        sql.setInt(2, Data.getUser().getUid());
        
        if (sql.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
