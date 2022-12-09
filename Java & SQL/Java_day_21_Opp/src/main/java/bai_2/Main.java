/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ten = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = sc.nextDouble(); sc.nextLine();
            SinhVien sv = new SinhVien(i+1, lop, gpa, ten, ngaySinh, diaChi);
            sv.chuanHoaTen();
            sv.chuanHoaNgaySinh();
            list.add(sv);
        }
        Collections.sort(list, new SortByName());
        for(SinhVien x:list)
            System.out.println(x);
    }
}
