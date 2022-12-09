/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_5;

/**
 *
 * @author wwhac
 */
public class SinhVien extends Person{
    private String maSinhVien;
    private String lop;
    private double gpa;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMaSinhVien() {
        return this.maSinhVien;
    }

    public double getGpa() {
        return this.gpa;
    }
    
    @Override
    public void chuanHoaTen(){super.chuanHoaTen();}
    @Override
    public void chuanHoaNgaySinh(){super.chuanHoaNgaySinh();}
    @Override
    public String toString() {
        return  this.maSinhVien + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}
