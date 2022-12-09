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
public class Bai_30_sxSinhVien {
    private String Ma;
    private String Ten;
    private String Lop;
    private String Email;

    public Bai_30_sxSinhVien(String Ma, String Ten, String Lop, String Email) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Email = Email;
    }

    public String getMa() {
        return this.Ma;
    }

    @Override
    public String toString() {
        return this.Ma + " " + this.Ten + " " + this.Lop + " " + this.Email;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bai_30_sxSinhVien> A = new ArrayList<>();
        while(sc.hasNext()){
            String Ma = sc.nextLine();
            String Ten = sc.nextLine();
            String Lop = sc.nextLine();
            String Email = sc.nextLine();
            A.add(new Bai_30_sxSinhVien(Ma, Ten, Lop, Email));
        }
        Collections.sort(A, new Comparator<Bai_30_sxSinhVien>(){
            @Override
            public int compare(Bai_30_sxSinhVien t, Bai_30_sxSinhVien t1) {
                return t.getMa().compareTo(t1.getMa());
            }
        });
        for(Bai_30_sxSinhVien x:A)
            System.out.println(x);
    }
}
