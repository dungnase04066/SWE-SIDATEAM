/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.bo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author DungNA
 */
public class BGToolkit {

    public static String HTTPPostRequest(String targetURL, String urlParameters) {
        HttpURLConnection connection = null;
        try {
            //Create connection
            URL url = new URL(targetURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");

            connection.setRequestProperty("Content-Length",
                    Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");

            connection.setUseCaches(false);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream(
                    connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.close();

            //Get Response  
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\n');
            }
            rd.close();
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public static String md5(String str) {
        try {
            return DatatypeConverter.printHexBinary(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toLowerCase().trim();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            return null;
        }
    }

    /**
     *
     * @param name
     * @return Check name:name have only character.
     */
    public static boolean checkName(String name) {
        if (name.equals("")) {
            return false;
        }
        if (!name.matches("[a-zA-Z ]{0,50}")) {
            return false;
        }
        return true;
    }

    /**
     * username have only character, number, not special character
     *
     * @param username
     * @return
     */
    public static boolean checkUsername(String username) {
        if (username.equals("")) {
            return false;
        }
        if (!username.matches("[a-zA-Z0-9]{0,50}")) {
            return false;
        }
        return true;
    }

    /**
     * Upper first character in word after space
     *
     * @param name
     * @return
     */
    public static String formatName(String name) {
        String[] names = name.replaceAll("\\s+", " ").toLowerCase().split(" ");
        name = "";
        for (String name1 : names) {
            name1 = Character.toUpperCase(name1.charAt(0)) + name1.substring(1);
            name += " " + name1;
        }
        name = name.trim();
        return name;
    }

    /**
     * Input: day/month/year Check date:
     *
     * @param date
     * @return
     */
    public static boolean checkDate(String date) {
        if (!date.matches("[0-9]{2}+/+[0-9]{2}+/+[0-9]{4}")) {
            return false;
        }
        if (date.equals("")) {
            return false;
        }
        SimpleDateFormat sdm = new SimpleDateFormat("dd/MM/yyyy");
        sdm.setLenient(false);
        try {
            Date datetmp = sdm.parse(date);
            if (datetmp.compareTo(new Date()) > -1) {
                throw new Exception();
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param mail
     * @return
     */
    public static boolean checkMail(String mail) {
        if (mail.equals("")) {
            return false;
        }
        if (!mail.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$")) {
            return false;
        }
        return true;
    }

    /**
     *
     * @param pass1: new pass
     * @param pass2 : re-enter pass
     * @return
     */
    public static boolean checkPassword(String pass1, String pass2) {
        if (pass1.length() < 6) {
            return false;
        }
        if (!pass1.equals(pass2)) {
            return false;
        }
        return true;
    }

}
