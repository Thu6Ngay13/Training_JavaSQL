/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/*
    -Swing: AWT
    -JavaFX: dep hon, cong cu manh me hon
    JLabel : Nhan
    JButton : 
    JTextField : 
    JPasswordField :
    JTextArea :
    JCheckBox :
*/
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Example");
        frame.setSize(400, 300);
        
        JLabel lblUsername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");
        lblUsername.setBounds(50, 50, 80, 20);
        lblPassword.setBounds(50, 100, 80, 20);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 150, 80, 20);
        
        JTextField jtfUsername = new JTextField();
        JTextField jtfPassword = new JTextField();
        jtfUsername.setBounds(150, 50, 100, 20);
        jtfPassword.setBounds(150, 100, 100, 20);
        
        frame.add(lblUsername);
        frame.add(lblPassword);
        frame.add(btnLogin);
        frame.add(jtfUsername);
        frame.add(jtfPassword);
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jtfUsername.getText();
                String password = jtfPassword.getText();
                System.out.println(username + " " + password);
            }
        });
    }
}

