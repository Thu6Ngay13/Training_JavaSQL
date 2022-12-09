/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_1;

import bai_6.*;
import java.util.ArrayList;
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
            String ngaySinhvaDiaChi = sc.nextLine();
            String lop = sc.nextLine();
            double gpa = sc.nextDouble(); sc.nextLine();
            if(ngaySinhvaDiaChi.charAt(1) == '/') 
                ngaySinhvaDiaChi = "0" + ngaySinhvaDiaChi;
            if(ngaySinhvaDiaChi.charAt(4) == '/') 
                ngaySinhvaDiaChi = ngaySinhvaDiaChi.substring(0, 3) 
                + "0" + ngaySinhvaDiaChi.substring(3, ngaySinhvaDiaChi.length());
            String ngaySinh = ngaySinhvaDiaChi.substring(0, 10);
            String diaChi = ngaySinhvaDiaChi.substring(10, ngaySinhvaDiaChi.length());
            list.add(new SinhVien(i+1, lop, gpa, ten, ngaySinh, diaChi));
        }
        for(SinhVien x:list){
            x.chuanHoaTen();
            x.chuanHoaNgaySinh();
            System.out.println(x);
        }
    }
}
