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
public class Bai_9_ThuNhap {
    private String Ma;
    private String Ten;
    private int Luong;

    public Bai_9_ThuNhap(String Ma, String Ten, int Luong) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Luong = Luong;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Ma = sc.nextLine();
        String Ten = sc.nextLine();
        int BacLuong = sc.nextInt();
        String ChucVu = Ma.substring(0, 2);
        int HeSoLuong = Integer.parseInt(Ma.substring(2, 4));
        int Luong = BacLuong*HeSoLuong;
        if(ChucVu.equals("HT")) Luong += 2000000;
        else if(ChucVu.equals("HP")) Luong += 900000;
        else Luong += 500000;
        System.out.println(Ma + " " + Ten + " " + HeSoLuong + " " + Luong);
    }
}
