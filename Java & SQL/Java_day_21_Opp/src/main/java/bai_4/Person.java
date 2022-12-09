/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai_4;

import bai_3.*;

/**
 *
 * @author wwhac
 */

public class Person{
    private String ten;
    private String ngaySinh;
    private String diaChi;

    public Person() {}

    public Person(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void chuanHoaTen(){
        String str = "";
        String x[] = this.ten.split("\\s+");
        for(int i = 0; i < x.length; i++){
            str += Character.toUpperCase(x[i].charAt(0));
            for(int j = 1; j < x[i].length(); j++)
                str += Character.toLowerCase(x[i].charAt(j));
            str += " ";
        }
        str = str.trim();
        this.ten = str;
    }
    
    public void chuanHoaNgaySinh(){
        String x[] = this.ngaySinh.split("/");
        if(x[0].length() == 1) x[0] = "0" + x[0];
        if(x[1].length() == 1) x[1] = "0" + x[1];
        this.ngaySinh = x[0] + "/" + x[1] + "/" + x[2];
    }

    public String getDiaChi(){
        return this.diaChi;
    }
    @Override
    public String toString() {
        return this.ten + " " + this.ngaySinh + " " + this.diaChi;
    }
}