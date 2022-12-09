/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogInForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author wwhac
 */
public class LoginForm extends JFrame implements ActionListener{
    private JLabel lbluser, lblpass;
    private JTextField jtfuser;
    private JPasswordField jpfpass;
    private JButton btn1, btn2;
   
    public LoginForm() {
        this.setTitle("Login Form");
        this.lbluser = new JLabel("Username");
        this.lblpass = new JLabel("PassWord");
        this.lbluser.setBounds(50, 50, 100, 30);
        this.lblpass.setBounds(50, 80, 100, 30);

        this.jtfuser = new JTextField();
        this.jpfpass = new JPasswordField();
        this.jtfuser.setBounds(180, 50, 100, 30);
        this.jpfpass.setBounds(180, 80, 100, 30);

        this.btn1 = new JButton("Login");
        this.btn2 = new JButton("Register");
        this.btn1.setBounds(50, 200, 100, 30);
        this.btn2.setBounds(180, 200, 100, 30);
        
        this.add(this.lbluser);
        this.add(this.lblpass);
        this.add(this.jtfuser);
        this.add(this.jpfpass);
        this.add(this.btn1);
        this.add(this.btn2);
        
        this.btn1.addActionListener(this);
        this.btn2.addActionListener(this);

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Account acc = new Account();
            if(e.getSource() ==  this.btn1){
                String user =  this.jtfuser.getText();
                String pass = new String(this.jpfpass.getPassword());
                
                if(acc.getAccount(user, pass)) JOptionPane.showMessageDialog(null, "Login Successfully");
                else JOptionPane.showMessageDialog(null, "Login Falied");
            }
            else new RegisterForm();
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
