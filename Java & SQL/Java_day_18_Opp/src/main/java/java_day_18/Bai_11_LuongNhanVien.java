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
public class Bai_11_LuongNhanVien {
    private String Ten;
    private int LuongCoBan;
    private int SoNgayCong;
    private String ChucVu;

    public Bai_11_LuongNhanVien(String Ten, int LuongCoBan, int SoNgayCong, String ChucVu) {
        this.Ten = Ten;
        this.LuongCoBan = LuongCoBan;
        this.SoNgayCong = SoNgayCong;
        this.ChucVu = ChucVu;
    }
    
    @Override
    public String toString() {
        long Luong = 1l*this.LuongCoBan*this.SoNgayCong;
        long Thuong = 0;
        long PhuCap = 150000;
        
        if(this.SoNgayCong >= 25) Thuong = Luong/5;
        else if(this.SoNgayCong >= 22) Thuong = Luong/10;
        
        if((this.ChucVu).equals("GD")) PhuCap = 250000;
        else if((this.ChucVu).equals("PGD")) PhuCap = 200000;
        else if((this.ChucVu).equals("TP")) PhuCap = 180000;
        
        long ThuNhap = Luong + Thuong + PhuCap;
        return "NV01 " + this.Ten + " " 
            + Luong + " " + Thuong + " " + PhuCap + " " + ThuNhap;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Ten = sc.nextLine();
        int LuongCoBan = sc.nextInt();
        int SoNgayCong = sc.nextInt(); sc.nextLine();
        String ChucVu = sc.next();
        Bai_11_LuongNhanVien x = new Bai_11_LuongNhanVien(Ten, LuongCoBan, SoNgayCong, ChucVu);
        System.out.println(x);
    }
}
