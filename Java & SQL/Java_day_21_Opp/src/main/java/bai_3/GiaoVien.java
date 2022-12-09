/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_3;

/**
 *
 * @author wwhac
 */
public class GiaoVien extends Person{
    private String maGiaoVien;
    private String khoa;
    private long luong;

    public GiaoVien() {
    }

    public GiaoVien(String maGiaoVien, String khoa, long luong, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.maGiaoVien = maGiaoVien;
        this.khoa = khoa;
        this.luong = luong;
    }
    
    @Override
    public void chuanHoaTen(){super.chuanHoaTen();}
    @Override
    public void chuanHoaNgaySinh(){super.chuanHoaNgaySinh();}
    @Override
    public String toString() {
        return this.maGiaoVien + " " + super.toString() + " " + this.khoa + " " + this.luong;
    }
}
