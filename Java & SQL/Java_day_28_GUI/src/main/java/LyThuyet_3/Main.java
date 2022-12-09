/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author wwhac
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        
        JButton btnSouth = new JButton("South");
        JButton btnNorth = new JButton("North");
        JButton btnWest = new JButton("West");
        JButton btnEast = new JButton("East");
        JButton btnCenter = new JButton("Center");
        
        btnSouth.setBackground(Color.yellow);
        
//        frame.setLayout(new BorderLayout());
        frame.setLayout(new GridLayout(3, 4));
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnCenter, BorderLayout.CENTER);
        
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
