/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_22.Test;

import java_day_22.Test.DaiHoc;

/**
 *
 * @author wwhac
 */
public class SinhVien extends DaiHoc {
    private double gpa;
    private String lop;

    public SinhVien() {
    }
    
    public SinhVien(double gpa, String lop, String ma, String ten, String ngaySinh, String soDienThoai, String diaChi) {
        super(ma, ten, ngaySinh, soDienThoai, diaChi);
        this.gpa = gpa;
        this.lop = lop;
    }
}
