/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_2_SinhVien {
    private String HoTen;
    private String NgaySinh;
    private double D1, D2, D3;

    public Bai_2_SinhVien(String HoTen, String NgaySinh, double D1, double D2, double D3) {
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.D1 = D1;
        this.D2 = D2;
        this.D3 = D3;
    }
    
    @Override 
    public String toString(){
        return this.HoTen + " " + this.NgaySinh + " " 
        + String.format("%.1f", this.D1 + this.D2 + this.D3);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        Bai_2_SinhVien x = new Bai_2_SinhVien(a, b, d1, d2, d3);
        System.out.println(x);
    }
}
