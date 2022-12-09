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
public class Bai_34_sxGiangVien {
    private static int Count = 0;
    private int Ma;
    private String Ten;
    private String Mon;

    public Bai_34_sxGiangVien(String Ten, String Mon) {
        Count++;
        this.Ma = Count;
        this.Ten = Ten;
        this.Mon = Mon;
    }

    public int getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    @Override
    public String toString() {
        String x = Integer.toString(this.Ma);
        while(x.length() < 2) x = "0" + x;
        x = "GV" + x;
        String[] p = this.Mon.split("\\s+");
        String y = "";
        for(int i = 0; i < p.length; i++)
            y += Character.toUpperCase(p[i].charAt(0));
        return x + " " + this.Ten + " " + y;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Bai_34_sxGiangVien[] A = new Bai_34_sxGiangVien[n];
        for(int i = 0; i < n; i++){
            String Ten = sc.nextLine();
            String Mon = sc.nextLine();
            A[i] = new Bai_34_sxGiangVien(Ten, Mon);
        }
        Arrays.sort(A, new Comparator<Bai_34_sxGiangVien>(){
            @Override
            public int compare(Bai_34_sxGiangVien t, Bai_34_sxGiangVien t1) {
                String[] o = t.getTen().split("\\s+");
                String[] o1 = t1.getTen().split("\\s+");
                String c = o[o.length-1];
                String c1 = o1[o1.length-1];
                if(!c.equals(c1)) return c.compareTo(c1);
                return t.getMa() - t1.getMa();
            }
        });
        for(Bai_34_sxGiangVien x:A)
            System.out.println(x);
    }
    
}
