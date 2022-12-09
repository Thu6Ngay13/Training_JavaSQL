/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

/**
 *
 * @author wwhac
 */
public class Check_Combo implements ItemListener, ActionListener{
    JFrame frame;
    JCheckBox cbox1, cbox2;
    JComboBox cbbox1, cbbox2;
    public Check_Combo() {
        this.frame = new JFrame("Data");
        this.frame.setSize(450, 600);
        
        this.cbox1 = new JCheckBox("Nam");
        this.cbox2 = new JCheckBox("Nu");
        this.cbox1.setBounds(50, 50, 100, 20);
        this.cbox2.setBounds(50, 100, 100, 20);
        
        String[] arr = {"C++", "Java", "Python", "C#"};
        this.cbbox1 = new JComboBox(arr);
        this.cbbox1.setBounds(50, 150, 100, 20);
        
        this.frame.add(cbox1);
        this.frame.add(cbox2);
        this.frame.add(cbbox1);
        
        this.cbox1.addItemListener(this);
        this.cbox2.addItemListener(this);
        this.cbbox1.addActionListener(this);
        
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(null);
        this.frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String res = (String) this.cbbox1.getItemAt(cbbox1.getSelectedIndex());
        System.out.println(res);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource() == cbox1 && ie.getStateChange() == 1)
                System.out.println("Nam");
        else if(ie.getSource() == cbox2 && ie.getStateChange() == 1) 
                System.out.println("Nu");
    }
    
    public static void main(String[] args) {
        new Check_Combo();
    }
}
 