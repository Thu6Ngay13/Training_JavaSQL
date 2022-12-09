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
public class Bai_22_SinhVien {
    private static int Count = 0;
    private int Ma;
    private String Name;
    private String Class;
    private String Birth;
    private double GPA;

    public Bai_22_SinhVien(String Name, String Class, String Birth, double GPA) {
        Count++;
        this.Ma = Count;
        this.Name = Name;
        this.Class = Class;
        this.Birth = Birth;
        this.GPA = GPA;
    }
    
    private static String chuanHoa(String x){
        String[] y = x.split("/");
        if(y[0].length() == 1) y[0] = "0" + y[0];
        if(y[1].length() == 1) y[1] = "0" + y[1];
        return y[0] + "/" + y[1] + "/" + y[2];
    }

    @Override
    public String toString() {
        String x = Integer.toString(this.Ma);
        while(x.length() < 3) x = "0" + x;
        x = "SV" + x;
        return x + " " + this.Name + " " + this.Class + " " + chuanHoa(this.Birth)
            + " " + String.format("%.2f", this.GPA);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Bai_22_SinhVien[] A = new Bai_22_SinhVien[n];
        for(int i = 0; i < n; i++){
            String Name = sc.nextLine();
            String Class = sc.nextLine();
            String Birth = sc.nextLine();
            double GPA = sc.nextDouble(); sc.nextLine();
            A[i] = new Bai_22_SinhVien(Name, Class, Birth, GPA);
        }
        for(Bai_22_SinhVien x:A)
            System.out.println(x);
    }
    
}

