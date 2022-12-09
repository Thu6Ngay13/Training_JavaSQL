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
public class GiangVien extends DaiHoc {
    private long luong;
    private String khoa;

    public GiangVien() {
    }
    
    public GiangVien(long luong, String khoa, String ma, String ten, String ngaySinh, String soDienThoai, String diaChi) {
        super(ma, ten, ngaySinh, soDienThoai, diaChi);
        this.luong = luong;
        this.khoa = khoa;
    }
}
