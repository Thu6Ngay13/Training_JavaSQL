/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogInForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author wwhac
 */
public class Account {
    private String url = "jdbc:sqlserver://TienLe\\Developer;databaseName=Account;encrypt=true;trustServerCertificate=true";
    private String username_sql = "sa";
    private String password_sql = "sa"; 
    private Connection con;

    public Account() throws SQLException {
        this.con = DriverManager.getConnection(url, username_sql, password_sql);
    }
    
    public boolean checkAccount(String user) throws SQLException{
        String sql = "SELECT * FROM Account WHERE username = ?";
        PreparedStatement stm = this.con.prepareStatement(sql);
        stm.setString(1, user);
        stm.execute();
        ResultSet rs = stm.executeQuery(); 
        return rs.next();
    }
    
    public boolean getAccount(String user, String pass) throws SQLException{
        String sql = "SELECT * FROM Account WHERE username = ? AND password = ?";
        PreparedStatement stm = this.con.prepareStatement(sql);
        stm.setString(1, user);
        stm.setString(2, pass);
        stm.execute();
        ResultSet rs = stm.executeQuery(); 
        return rs.next();
    }
    
    public void addAccount(String user, String pass) throws SQLException{
        String sql = "INSERT INTO Account VALUES(?, ?)";
        PreparedStatement stm = this.con.prepareStatement(sql);
        stm.setString(1, user);
        stm.setString(2, pass);
        stm.execute();
    }
}
