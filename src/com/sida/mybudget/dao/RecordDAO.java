/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.dao;

import com.sida.mybudget.bo.BGToolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public static Vector getList() throws SQLException {
        PreparedStatement sql = Data.getConn().prepareStatement("SELECT * FROM record WHERE uid = ? ORDER BY date DESC");
        sql.setInt(1, Data.getUser().getUid());
        Vector<Vector> v = new Vector();
        ResultSet rs = sql.executeQuery();
        while (rs.next()) {
            Vector temp = new Vector();
            temp.add(rs.getInt("rid"));
            temp.add(rs.getInt("uid"));
            temp.add(rs.getDouble("amount"));
            temp.add(rs.getBoolean("type"));
            String date = BGToolkit.convertToDB(rs.getString("date"));
            temp.add(date);
            temp.add(rs.getString("note"));
            v.add(temp);
        }
        return v;
    }

    public static Vector getList(String dateFrom, String dateTo, double amount, int type) throws SQLException {
        Statement sta = Data.getConn().createStatement();
        String sql = "SELECT * FROM record WHERE uid =" + Integer.toString(Data.getUser().getUid());
        if (!dateFrom.equals("")) {
            sql += " AND date>='" + dateFrom + "'";
        }
        if (!dateTo.equals("")) {
            sql += " AND date<='" + dateTo + "'";
        }
        if (amount > 0) {
            sql += " AND amount=" + Double.toString(amount);
        }
        if (type > 0) {
            sql += " AND type=" + Integer.toString(type % 2);
        }
        sql += "  ORDER BY date DESC";
        Vector<Vector> v = new Vector();
        ResultSet rs = sta.executeQuery(sql);
        while (rs.next()) {
            Vector temp = new Vector();
            temp.add(rs.getInt("rid"));
            temp.add(rs.getInt("uid"));
            temp.add(rs.getDouble("amount"));
            temp.add(rs.getBoolean("type"));
            String date = rs.getString("date");
            date = BGToolkit.convertToDB(date);
            temp.add(date);
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

    public static Vector get(int id) throws SQLException {
        PreparedStatement sql = Data.getConn().prepareStatement("SELECT * FROM record WHERE rid = ?");
        sql.setInt(1, id);
        Vector v = new Vector();
        ResultSet rs = sql.executeQuery();
        while (rs.next()) {
            v.add(rs.getInt("rid"));
            v.add(rs.getInt("uid"));
            v.add(rs.getDouble("amount"));
            v.add(rs.getBoolean("type"));
            String date = rs.getString("date");
            date = BGToolkit.convertToDB(date);
            v.add(date);
            v.add(rs.getString("note"));
        }
        return v;
    }

    public static boolean editRecord(int rid, String date, double amount, int type, String note) throws SQLException {
        PreparedStatement sql = Data.getConn().prepareStatement("UPDATE record SET type=?, amount=?, date=?, note=? WHERE rid=? AND uid=?");
        sql.setInt(1, type);
        sql.setDouble(2, amount);
        sql.setString(3, date);
        sql.setString(4, note);
        sql.setInt(5, rid);
        sql.setInt(6, Data.getUser().getUid());
        if (sql.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Vector<String> getViewTime(int viewType) throws SQLException {
        PreparedStatement sql;
        if (viewType == 0) {
            sql = Data.getConn().prepareStatement("SELECT MONTH(date) m,YEAR(date) y FROM record WHERE uid = ? GROUP BY y,m ORDER BY y DESC, m DESC");
        } else {
            sql = Data.getConn().prepareStatement("SELECT YEAR(date) y FROM record WHERE uid = ? GROUP BY y ORDER BY y DESC");
        }

        sql.setInt(1, Data.getUser().getUid());
        Vector v = new Vector();
        ResultSet rs = sql.executeQuery();
        while (rs.next()) {
            if (viewType == 0) {
                v.add(rs.getString("m") + "-" + rs.getString("y"));
            } else {
                v.add(rs.getString("y"));
            }
        }
        return v;
    }

    public static Vector<Vector> getStatistics(String time, int typeView) throws SQLException {
        if(time==null){
            return new Vector<>();
        }
        if (typeView == 0) {
            time = "MONTH(date)=" + time.replaceAll("-", " AND YEAR(date)=");
        } else {
            time = "YEAR(date)=" + time;
        }
        PreparedStatement sql = Data.getConn().prepareStatement("SELECT * FROM record WHERE uid = ? AND " + time + "  ORDER BY date DESC");
        sql.setInt(1, Data.getUser().getUid());
        Vector<Vector> v = new Vector();
        ResultSet rs = sql.executeQuery();
        while (rs.next()) {
            Vector temp = new Vector();
            temp.add(rs.getInt("rid"));
            temp.add(rs.getInt("uid"));
            temp.add(rs.getDouble("amount"));
            temp.add(rs.getBoolean("type"));
            String date = rs.getString("date");
            date = BGToolkit.convertToDB(date);
            temp.add(date);
            temp.add(rs.getString("note"));
            v.add(temp);
        }
        return v;
    }
}
