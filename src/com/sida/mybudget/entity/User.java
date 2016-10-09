/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sida.mybudget.entity;

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

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", name=" + name + ", user=" + user + ", email=" + email + ", pass=" + pass + ", gender=" + gender + '}';
    }

}
