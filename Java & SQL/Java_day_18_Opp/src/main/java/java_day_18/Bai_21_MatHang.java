/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_21_MatHang {
    private static int Count = 0;
    private int Ma;
    private String Ten;
    private String DonVi;
    private long GiaMua;
    private long GiaBan;

    public Bai_21_MatHang(String Ten, String DonVi, long GiaMua, long GiaBan) {
        Count++;
        this.Ma = Count;
        this.Ten = Ten;
        this.DonVi = DonVi;
        this.GiaMua = GiaMua;
        this.GiaBan = GiaBan;
    }

    public int getMa() {
        return this.Ma;
    }
    
    public long getGiaMua() {
        return this.GiaMua;
    }

    public long getGiaBan() {
        return this.GiaBan;
    }

    @Override
    public String toString() {
        long LoiNhuan = this.GiaBan - this.GiaMua;
        String x = Integer.toString(this.Ma);
        String str = "MH";
        for(int i = 0; i < 4 - x.length(); i++) str += "0";
        str += x;
        return str + " " + this.Ten + " " + this.DonVi + " " 
            + this.GiaMua + " " + this.GiaBan + " " + LoiNhuan;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bai_21_MatHang> list = new ArrayList<>();
        int n = sc.nextInt(); sc.nextLine();
        for(int i = 0; i < n; i++){
            String Ten = sc.nextLine();
            String DonVi = sc.nextLine();
            long GiaMua = sc.nextLong();
            long GiaBan = sc.nextLong(); sc.nextLine();
            Bai_21_MatHang x = new Bai_21_MatHang(Ten, DonVi, GiaMua, GiaBan);
            list.add(x);
        }
        Collections.sort(list, new Comparator<Bai_21_MatHang>(){
            @Override
            public int compare(Bai_21_MatHang t, Bai_21_MatHang t1) {
                long x = t.getGiaBan()-t.getGiaMua();
                long y = t1.getGiaBan()-t1.getGiaMua();
                if(x == y) return t.getMa() - t1.getMa();
                return (int)(y - x);
            }
        });
        for(Bai_21_MatHang x:list) System.out.println(x);
    }
}
