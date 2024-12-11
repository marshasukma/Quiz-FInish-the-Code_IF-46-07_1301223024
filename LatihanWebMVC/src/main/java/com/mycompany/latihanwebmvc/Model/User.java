/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanwebmvc.Model;

import com.mycompany.latihanwebmvc.Database.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author helmy
 */
public class User {

    private int id;
    private String username;
    private String password;
    private String fullName;

    // default Constructor
    public User() {
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Constructor dengan parameter
    public User(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public User(int id, String username, String password, String fullName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    // Getter dan Setter untuk username
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Validasi login (contoh saja kita kasih hardcode untuk username "admin" dan password "admin123")
    public boolean isValidUser() {
        try (Connection conn = DBUtil.getConnection()) {
            String query = "select count(*) from users where username = ? and password = ?";
            PreparedStatement stmt = conn.prepareStatement(query); 
                stmt.setString(1, username);
                stmt.setString(2, password);
                try (ResultSet rs = stmt.executeQuery()){
                    if(rs.next()){
                     int jumlah=rs.getInt(1);
                     return jumlah>0;   
                    }
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
