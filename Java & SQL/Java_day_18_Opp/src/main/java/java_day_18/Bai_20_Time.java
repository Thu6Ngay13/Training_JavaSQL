/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_20_Time {
    private int Gio;
    private int Phut;
    private int Giay;

    public Bai_20_Time(int Gio, int Phut, int Giay) {
        this.Gio = Gio;
        this.Phut = Phut;
        this.Giay = Giay;
    }
    
    public long convertGiay(){
        return this.Gio*1l*60*60 + this.Phut*1l*60 + this.Giay;
    }

    @Override
    public String toString() {
        return this.Gio + " " + this.Phut + " " + this.Giay;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Bai_20_Time[] A = new Bai_20_Time[n];
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            A[i] = new Bai_20_Time(x, y, z);
        }
        Arrays.sort(A, new Comparator<Bai_20_Time>(){
            @Override
            public int compare(Bai_20_Time t, Bai_20_Time t1) {
                long o1 = t.convertGiay();
                long o2 = t1.convertGiay();
                return (int)(o1 - o2);
            }
        });
        for(int i = 0; i < n; i++)
            System.out.println(A[i]);
    }
}
