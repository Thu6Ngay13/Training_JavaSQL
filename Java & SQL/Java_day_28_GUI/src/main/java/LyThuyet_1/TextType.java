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
public class TextType implements ActionListener{
    JFrame frame;
    JTextArea jtaData;
    JTextField jtfResult;
    JButton btnCount;
    public TextType() {
        this.frame = new JFrame("Data");
        this.frame.setSize(450, 600);
        
        this.jtaData = new JTextArea("Input data");
        this.jtaData.setBounds(50, 50, 300, 300);
        this.jtaData.setLineWrap(true);
        this.jtaData.setWrapStyleWord(true);
        
        this.btnCount = new JButton("Count");
        this.btnCount.setBounds(50, 400, 80, 20);
        
        this.jtfResult = new JTextField();
        this.jtfResult.setBounds(150, 400, 80, 20);
        
        this.frame.add(jtaData);
        this.frame.add(btnCount);
        this.frame.add(jtfResult);
        
        this.btnCount.addActionListener(this);
        
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String text = this.jtaData.getText();
        String[] arr = text.split("\\s+");
        jtfResult.setText(arr.length + " ");
    }
    public static void main(String[] args) {
        new TextType();
    }
}
