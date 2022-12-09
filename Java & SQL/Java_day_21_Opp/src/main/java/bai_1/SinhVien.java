/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_1;

/**
 *
 * @author wwhac
 */
public class SinhVien extends Person{
    private int maSinhVien;
    private String lop;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(int maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getLop() {
        return this.lop;
    }
    
    @Override
    public void chuanHoaTen(){super.chuanHoaTen();}
    @Override
    public void chuanHoaNgaySinh(){super.chuanHoaNgaySinh();}
    @Override
    public String toString() {
        String str = Integer.toString(maSinhVien);
        while(str.length() < 4) str = "0" + str;
        return str + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}
