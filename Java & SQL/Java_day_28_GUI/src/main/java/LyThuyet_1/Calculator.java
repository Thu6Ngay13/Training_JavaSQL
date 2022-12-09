/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author wwhac
 */
public class Calculator implements ActionListener{
    JFrame frame;
    JLabel lblNumber1;
    JLabel lblNumber2;
    JLabel lblResult;
    JButton btnCong;
    JButton btnTru;
    JButton btnNhan;
    JButton btnChia;
    JTextField jtfNumber1;
    JTextField jtfNumber2;
    JTextField jtfResult;

    public Calculator() {
        frame = new JFrame("Simple GUI");
        frame.setSize(500, 500);
        
        lblNumber1 = new JLabel("Number 1");
        lblNumber2 = new JLabel("Number 2");
        lblResult = new JLabel("Result");
        lblNumber1.setBounds(50, 50, 70, 25);
        lblNumber2.setBounds(50, 100, 70, 25);
        lblResult.setBounds(50, 200, 70, 25);
        
        jtfNumber1 = new JTextField();
        jtfNumber2 = new JTextField();
        jtfResult = new JTextField();
        jtfNumber1.setBounds(150, 50, 70, 25);
        jtfNumber2.setBounds(150, 100, 70, 25);
        jtfResult.setBounds(250, 200, 70, 25);
        
        btnCong = new JButton("Cong");
        btnTru = new JButton("Tru");
        btnNhan = new JButton("Nhan");
        btnChia = new JButton("Chia");
        btnCong.setBounds(50, 150, 80, 20);
        btnTru.setBounds(150, 150, 80, 20);
        btnNhan.setBounds(250, 150, 80, 20);
        btnChia.setBounds(350, 150, 80, 20);
        
        frame.add(lblNumber1);
        frame.add(lblNumber2);
        frame.add(lblResult);
        frame.add(jtfNumber1);
        frame.add(jtfNumber2);
        frame.add(jtfResult);
        frame.add(btnCong);
        frame.add(btnTru);
        frame.add(btnNhan);
        frame.add(btnChia);
        
        btnCong.addActionListener(this);
        btnTru.addActionListener(this);
        btnNhan.addActionListener(this);
        btnChia.addActionListener(this);
        
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(jtfNumber1.getText());
        int b = Integer.parseInt(jtfNumber2.getText());
        
        if(e.getSource() == btnCong)
            jtfResult.setText(a + b + " ");
        else if(e.getSource() == btnTru)
            jtfResult.setText(a - b + " ");
        else if(e.getSource() == btnNhan)
            jtfResult.setText(a * b + " ");
        else 
            jtfResult.setText(1.0*a / b + " ");
    }
}
