/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author wwhac
 */
public class GUIExample extends JFrame implements ActionListener{
    /*
        JOptionPane
        getActionCommand, getSource
        JList
        JTable
    */
    JButton btn1, btn2, order;
    JList listF, listD;

    public GUIExample() {
//        btn1 = new JButton("Login");
//        btn2 = new JButton("Register");
//        btn1.setBounds(50, 50, 80, 20);
//        btn2.setBounds(50, 150, 80, 20);

        DefaultListModel model1 = new DefaultListModel();
        model1.addElement("Ga ran");
        model1.addElement("Khoai tay chien");
        model1.addElement("Pho");
        model1.addElement("Mi tom");
        this.listF = new JList(model1);
        this.listF.setBounds(50, 50, 100, 200);
        
        String[] drink = {"Cocacola", "Pepsi", "Sting", "Beer"};
        DefaultListModel model2 = new DefaultListModel();
        for(String x:drink) model2.addElement(x);
        this.listD = new JList(model2);
        this.listD.setBounds(200, 50, 100, 200);
        
        this.order = new JButton("Order");
        this.order.setBounds(50, 300, 80, 20);
        
        this.add(this.listD);
        this.add(this.listF);
        this.add(this.order);
        
//        this.btn1.addActionListener(this);
//        this.btn2.addActionListener(this);
        this.order.addActionListener(this);
        
        this.setSize(400, 600);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
        JButton clickButton = (JButton) e.getSource();
        if(clickButton == btn1)
            JOptionPane.showMessageDialog(null, "Login click");
        else 
            JOptionPane.showMessageDialog(null, "Register click");
        */
        
        /*
        String command = e.getActionCommand();
        if(command.equals("Login"))
            JOptionPane.showMessageDialog(null, "Login click");
        else 
            JOptionPane.showMessageDialog(null, "Register click");
        */
        
        /*
        System.out.println("Selected food: ");
        System.out.println((String)listF.getSelectedValue());
        System.out.println("Selected dink: ");
        System.out.println(listD.getSelectedValue());
        */
        System.out.println("Selected food: ");
        int[] idx1 = listF.getSelectedIndices();
        for(int i:idx1)
            System.out.println("-" + listF.getModel().getElementAt(i));
        System.out.println("Selected dink: ");
        int[] idx2 = listD.getSelectedIndices();
        for(int i:idx2)
            System.out.println("-" + listD.getModel().getElementAt(i));
    }
    
    public static void main(String[] args) {
        new GUIExample();
    }
}
