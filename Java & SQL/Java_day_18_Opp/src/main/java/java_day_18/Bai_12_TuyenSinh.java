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
public class Bai_12_TuyenSinh {
    private String Ma;
    private String Ten;
    private double Toan;
    private double Ly;
    private double Hoa;

    public Bai_12_TuyenSinh(String Ma, String Ten, double Toan, double Ly, double Hoa) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    @Override
    public String toString() {
        double Tong = this.Toan + this.Ly + this.Hoa;
        String KetQua = "TRUNG TUYEN";
        String MaKV = this.Ma.substring(0, 3);
        
        if(MaKV.equals("KV1")) Tong += 0.5;
        else if(MaKV.equals("KV2")) Tong += 1.0;
        else Tong += 2.5;
        
        if(Tong < 24) KetQua = "TRUOT";
        
        if((int)Tong == Tong)
            return this.Ma + " " + this.Ten + " " + this.Ma.charAt(2) + " "
            + String.format("%.0f", Tong) + " " + KetQua;
        return this.Ma + " " + this.Ten + " " + this.Ma.charAt(2) + " "
            + String.format("%.1f", Tong) + " " + KetQua;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Ma = sc.nextLine();
        String Ten = sc.nextLine();
        double Toan = sc.nextDouble();
        double Ly = sc.nextDouble();
        double Hoa = sc.nextDouble();
        Bai_12_TuyenSinh x = new Bai_12_TuyenSinh(Ma, Ten, Toan, Ly, Hoa);
        System.out.println(x);
    }
}
