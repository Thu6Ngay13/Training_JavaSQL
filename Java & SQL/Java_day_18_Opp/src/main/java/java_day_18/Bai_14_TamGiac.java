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
public class Bai_14_TamGiac {
    private double x;
    private double y;
    
    public Bai_14_TamGiac(double x, double y) {
        this.x = x;
        this.y = y;
    } 

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
    
    private static boolean valid(double AB, double BC, double AC){
        if(AB+BC <= AC || AB+AC <= BC || BC+AC <= AB)
            return true;
        return false;
    }
    
    private static double dis(Bai_14_TamGiac a, Bai_14_TamGiac b){
        return Math.sqrt(Math.pow(a.getX()-b.getX(), 2) 
            + Math.pow(a.getY()-b.getY(), 2));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-- > 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();
            Bai_14_TamGiac A = new Bai_14_TamGiac(x1, y1);
            Bai_14_TamGiac B = new Bai_14_TamGiac(x2, y2);
            Bai_14_TamGiac C = new Bai_14_TamGiac(x3, y3);
            double AB = dis(A, B);
            double BC = dis(B, C);
            double AC = dis(A, C);
            if(valid(AB, BC, AC))
                System.out.println("INVALID");
            else{
                double ChuVi = AB + BC + AC;
                double p = ChuVi/2;
                double DienTich = Math.sqrt(p*(p-AB)*(p-BC)*(p-AC));
                System.out.printf("%.3f %.3f" + "\n", ChuVi, DienTich);
            }
        }
    }
}
