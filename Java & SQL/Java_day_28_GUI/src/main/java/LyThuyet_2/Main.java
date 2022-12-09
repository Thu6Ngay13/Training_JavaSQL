/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LyThuyet_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrew
 */
//JTable table = new JTable(data[][], column_name);
public class Main {

    public static void main(String[] args) {
        String[] columnName = {"ID", "Full name", "Class", "Gpa"};
        Object[][] data = {
            {"123", "Hoang Dinh Nam", "HTTT1", 3.5},
            {"124", "Luong Van Huy", "CNPM1", 3.2},
            {"125", "Nguyen Thi Nam", "CNPM2", 2.8},
            {"123", "Hoang Dinh Nam", "HTTT1", 3.5},
            {"124", "Luong Van Huy", "CNPM1", 3.2},
            {"125", "Nguyen Thi Nam", "CNPM2", 2.8},
            {"123", "Hoang Dinh Nam", "HTTT1", 3.5},
            {"124", "Luong Van Huy", "CNPM1", 3.2},
            {"125", "Nguyen Thi Nam", "CNPM2", 2.8},
            {"123", "Hoang Dinh Nam", "HTTT1", 3.5},
            {"124", "Luong Van Huy", "CNPM1", 3.2},
            {"125", "Nguyen Thi Nam", "CNPM2", 2.8},
            {"123", "Hoang Dinh Nam", "HTTT1", 3.5},
            {"124", "Luong Van Huy", "CNPM1", 3.2},
            {"125", "Nguyen Thi Nam", "CNPM2", 2.8}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnName);
        JTable table = new JTable(model);
        //JTable table = new JTable(new DefaultTableModel(data, columnName))

        JFrame frame = new JFrame("JTable Example");
        JScrollPane pane = new JScrollPane(table);

        pane.setBounds(50, 50, 400, 300);
        frame.add(pane);

        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(150, 480, 80, 30);
        
        JButton btnDel = new JButton("Delete");
        btnDel.setBounds(250, 480, 80, 30);
        
        JButton btnDisplay = new JButton("Display");
        btnDisplay.setBounds(350, 480, 80, 30);

        JButton btnSort = new JButton("Sort by Gpa");
        btnSort.setBounds(450, 480, 120, 30);
        
        frame.add(btnAdd);
        frame.add(btnDel);
        frame.add(btnDisplay);
        frame.add(btnSort);
        
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Scanner sc = new Scanner(System.in);
                String id = sc.nextLine();
                String fullName = sc.nextLine();
                String className = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{id, fullName, className, gpa});
                
                System.out.println(table.getRowCount());
                System.out.println(table.getColumnCount());
            }
        });
        
        btnDel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRowIndex = table.getSelectedRow();
                if(selectedRowIndex != -1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(selectedRowIndex);
                    JOptionPane.showMessageDialog(null, "Delete Successfully !");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please select row to delete");
                }
            }
        });
        
        btnDisplay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getRowCount();
                int col = table.getColumnCount();
                Object[][] data = new Object[row][col];
                for(int i = 0; i < row; i++){
                    //table.getValueAt(hang, cot)
                    for(int j = 0; j < col; j++){
                        data[i][j] = table.getValueAt(i, j);
                        System.out.print(data[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        });

        btnSort.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.getRowCount();
                int col = table.getColumnCount();
                Object[][] data = new Object[row][col];
                for(int i = 0; i < row; i++){
                    //table.getValueAt(hang, cot)
                    for(int j = 0; j < col; j++){
                        data[i][j] = table.getValueAt(i, j);
                        System.out.print(data[i][j] + " ");
                    }
                    System.out.println("");
                }
                Arrays.sort(data, new Comparator<Object[]>(){
                    @Override
                    public int compare(Object[] o1, Object[] o2) {
                        double gpa1 = (double)o1[3];
                        double gpa2 = (double)o2[3];
                        if(gpa1 > gpa2) return -1;
                        else return 1;
                    }
                });
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                for(int i = 0; i < row; i++){
                    model.addRow(data[i]);
                }
            }
        });
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
