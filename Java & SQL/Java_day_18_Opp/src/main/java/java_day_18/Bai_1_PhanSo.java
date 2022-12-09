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
public class Bai_1_PhanSo {
    private long tu;
    private long mau;
    private static long gcd(long a, long b){
        while(b != 0){
            long x = a%b;
            a = b;
            b = x;
        }
        return a;
    }
    public Bai_1_PhanSo(long tu, long mau){
        long x = gcd(tu, mau);
        this.tu = tu/x;
        this.mau = mau/x;
    }
    @Override
    public String toString(){
        return this.tu + "/" + this.mau;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        Bai_1_PhanSo x = new Bai_1_PhanSo(tu, mau);
        System.out.println(x);
    }
}
