/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_day_18;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class LyThuyet {

    @Override
    public String toString() {
        return "LyThuyet{" + '}';
    }
    /*
    khach hang, san pham, tai khoan, kho, gio hang
    +thuoc tinh: thong tin mo ta doi tuong
    +hanh dong: hanh dong cua doi tuong
    => class: khach hang tai khoan
    */
    
    /*
    cung package thi co the goi nhau
    khac package thi phai import nhu thu vien
    */
    
    /*
    -tinh dong goi: Escapsulation 
    +cac thuoc tinh cua lop phai de: private
        private String hoTen;
        private String ngaySinh;
        ...
    +cac phuong thuc phai de: public
        public String getHoTen(){...}
        ...
    +static: chung cho tat cac cac doi tuong, no thuoc ve class
    */
    
    /*
    private state int count = 0;
    private String HoTen;
    private String NgaySinh;
    private double D1, D2, D3;

    +contructor
    public LyThuyet(String HoTen, String NgaySinh, double D1, double D2, double D3) {
        count++;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.D1 = D1;
        this.D2 = D2;
        this.D3 = D3;
    }

    +get
    public String getHoTen() {
        return HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public double getD1() {
        return D1;
    }

    public double getD2() {
        return D2;
    }

    public double getD3() {
        return D3;
    }
    
    +set
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    
    +Override
    @Override
    pulic String toString(){ return...}
    
    +static
    public static getSoLuong(){ return count};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        LyThuyet SinhVien = new LyThuyet(x, y, d1, d2, d3);
        System.out.print(SinhVien.getHoTen() + " ");
        System.out.print(SinhVien.getNgaySinh() + " ");
        double sum = SinhVien.getD1() + SinhVien.getD2() + SinhVien.getD3();
        System.out.println("%.1f", sum);
        System.out.println(LyThuyet.getSoLuong());
    }
    */
    
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
        }
        catch(Exception ex){
            System.out.println(ex);
            //truy vet
            ex.printStackTrace();
        }
    }
    */
    
}

