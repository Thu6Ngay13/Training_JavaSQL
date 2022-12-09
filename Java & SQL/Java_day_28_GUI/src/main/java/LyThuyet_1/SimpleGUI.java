/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author wwhac
 */
public class SimpleGUI implements ActionListener {
    JFrame frame;
    JLabel lblUsername, lblPassword;
    JTextField jtfUsername, jtfPassword;
    JButton btnLogin, btnSignUp;

    public SimpleGUI() {
        this.frame = new JFrame("Simple GUI");
        
        this.lblUsername = new JLabel("Username");
        this.lblPassword = new JLabel("Password");
        this.lblUsername.setBounds(50, 50, 80, 20);
        this.lblPassword.setBounds(50, 100, 80, 20);
        
        this.jtfUsername = new JTextField();
        this.jtfPassword = new JTextField();
        this.jtfUsername.setBounds(150, 50, 100, 20);
        this.jtfPassword.setBounds(150, 100, 100, 20);
        
        this.btnLogin = new JButton("Login");
        this.btnLogin.setBounds(50, 150, 80, 20);
        
        this.btnSignUp = new JButton("Sign Up");
        this.btnSignUp.setBounds(170, 150, 80, 20);
        
        this.btnLogin.addActionListener(this);
        this.btnSignUp.addActionListener(this);
        
        this.frame.add(this.lblUsername);
        this.frame.add(this.lblPassword);
        this.frame.add(this.jtfUsername);
        this.frame.add(this.jtfPassword);
        this.frame.add(this.btnLogin);
        this.frame.add(this.btnSignUp);
        
        this.frame.setSize(300, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String username = this.jtfUsername.getText();
        String password = this.jtfPassword.getText();
        System.out.println(username + " " + password);
    }
    
    public static void main(String[] args) {
        new SimpleGUI();
    }
}
