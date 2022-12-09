/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author wwhac
 */
public class RegisterForm extends JFrame implements ActionListener{
    private JLabel lbluser, lblpass;
    private JTextField jtfuser;
    private JPasswordField jpfpass;
    private JButton btn;
    private ArrayList<Account> list;
    public RegisterForm(ArrayList<Account> list) {
        this.list = new ArrayList<>(list);
        this.setTitle("Login Form");
        this.lbluser = new JLabel("Username");
        this.lblpass = new JLabel("PassWord");
        this.lbluser.setBounds(50, 50, 100, 30);
        this.lblpass.setBounds(50, 80, 100, 30);

        this.jtfuser = new JTextField();
        this.jpfpass = new JPasswordField();
        this.jtfuser.setBounds(180, 50, 100, 30);
        this.jpfpass.setBounds(180, 80, 100, 30);

        this.btn = new JButton("Register");
        this.btn.setBounds(125, 200, 100, 30);
        
        this.add(this.lbluser);
        this.add(this.lblpass);
        this.add(this.jtfuser);
        this.add(this.jpfpass);
        this.add(this.btn);
        
        this.btn.addActionListener(this);

        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = this.jtfuser.getText();
        char[] c = this.jpfpass.getPassword();
        String pass = "";
        for(char x:c) pass += x;
        for(Account x:this.list)
            if(x.getUser().equals(user)){
                JOptionPane.showMessageDialog(null, "User exist");
                return;
            }
        this.list.add(new Account(user, pass));
        JOptionPane.showMessageDialog(null, "Register successfully");
    }
}
