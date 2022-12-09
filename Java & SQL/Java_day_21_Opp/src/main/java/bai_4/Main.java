/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

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
        ArrayList<GiaoVien> list1 = new ArrayList<>();
        ArrayList<SinhVien> list2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String ma = sc.nextLine();
            if(ma.substring(0, 2).equals("GV")){
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String khoa = sc.nextLine();
                long luong = sc.nextLong(); sc.nextLine();
                String lopChuNhiem = sc.nextLine();
                list1.add(new GiaoVien(ma, khoa, luong, lopChuNhiem, ten, ngaySinh, diaChi));
            }
            else{
                String ten = sc.nextLine();
                String ngaySinh = sc.nextLine();
                String diaChi = sc.nextLine();
                String lop = sc.nextLine();
                double gpa = sc.nextDouble(); sc.nextLine();
                list2.add(new SinhVien(ma, lop, gpa, ten, ngaySinh, diaChi));
            }
        }
        String diaChi = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN CO DIA CHI TAI " + diaChi + " :");
        for(GiaoVien x:list1)
            if(x.getDiaChi().equals(diaChi)){
                x.chuanHoaTen();
                x.chuanHoaNgaySinh();
                System.out.println(x);
            }
        System.out.println("DANH SACH SINH VIEN CO DIA CHI TAI " + diaChi + " :");
        for(SinhVien x:list2)
            if(x.getDiaChi().equals(diaChi)){
                x.chuanHoaTen();
                x.chuanHoaNgaySinh();
                System.out.println(x);
            }
    }
}
