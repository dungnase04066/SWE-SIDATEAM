/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author small tiger
 */
public class RecordDAO {
    public static boolean addNew(String date, double amount, int type, String note) throws SQLException{
        PreparedStatement sql = Data.getConn().prepareStatement("INSERT INTO record (uid, date, amount, type, note) VALUES (?,?,?,?,?)");
        sql.setInt(1, Data.getUser().getUid());
        sql.setString(2, date);
        sql.setDouble(3, amount);
        sql.setInt(4, type);
        sql.setString(5, note);
        
        if(sql.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
    }
    
}
