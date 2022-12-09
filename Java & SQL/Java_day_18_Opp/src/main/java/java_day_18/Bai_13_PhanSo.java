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
public class Bai_13_PhanSo {
    private long Tu;
    private long Mau;
    
    private static long GCD(long a, long b){
        while(b != 0){
            long x = a%b;
            a = b;
            b = x;
        }
        return a;
    }
    
    private static long LCM(long a, long b){
        return a/GCD(a, b)*b;
    }
    
    private static Bai_13_PhanSo C(Bai_13_PhanSo a, Bai_13_PhanSo b){
        long m = LCM(a.getMau(), b.getMau());
        long t = a.getTu()*(m/a.getMau()) + b.getTu()*(m/b.getMau());
        long x = GCD(t, m);
        m = m/x;
        t = t/x;
        Bai_13_PhanSo c = new Bai_13_PhanSo(t*t, m*m);
        return c;
    }
    
    private static Bai_13_PhanSo D(Bai_13_PhanSo a, Bai_13_PhanSo b, Bai_13_PhanSo c){
        long m = a.getMau()*b.getMau()*c.getMau();
        long t = a.getTu()*b.getTu()*c.getTu();
        long x = GCD(t, m);
        m = m/x;
        t = t/x;
        Bai_13_PhanSo d = new Bai_13_PhanSo(t, m);
        return d;
    }
    
    public Bai_13_PhanSo(long Tu, long Mau) {
        this.Tu = Tu;
        this.Mau = Mau;
    }

    public long getTu() {
        return Tu;
    }

    public long getMau() {
        return Mau;
    }
    
    @Override
    public String toString() {
        return this.Tu + "/" + this.Mau;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-- != 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            Bai_13_PhanSo x = new Bai_13_PhanSo(a, b);
            Bai_13_PhanSo y = new Bai_13_PhanSo(c, d);
            Bai_13_PhanSo p = C(x, y);
            Bai_13_PhanSo q = D(x, y, p);
            System.out.println(p + " " + q);
        }
    }
}
