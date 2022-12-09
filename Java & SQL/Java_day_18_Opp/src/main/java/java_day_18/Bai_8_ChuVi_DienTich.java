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
public class Bai_8_ChuVi_DienTich {
    private double x;
    private double y;

    public Bai_8_ChuVi_DienTich(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static double distance(Bai_8_ChuVi_DienTich p1, Bai_8_ChuVi_DienTich p2){
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double a = x1-x2;
        double b = y1-y2;
        return Math.sqrt(a*a + b*b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-- != 0){
            double xA = sc.nextDouble();
            double yA = sc.nextDouble();
            double xB = sc.nextDouble();
            double yB = sc.nextDouble();
            double xC = sc.nextDouble();
            double yC = sc.nextDouble();
            Bai_8_ChuVi_DienTich A = new Bai_8_ChuVi_DienTich(xA, yA);
            Bai_8_ChuVi_DienTich B = new Bai_8_ChuVi_DienTich(xB, yB);
            Bai_8_ChuVi_DienTich C = new Bai_8_ChuVi_DienTich(xC, yC);
            if(distance(A, B) + distance(B, C) <= distance(A, C)
                || distance(A, B) + distance(A, C) <= distance(B, C)
                || distance(B, C) + distance(A, C) <= distance(A, B)) 
                System.out.println("INVALID");
            else{
                System.out.printf("%.3f %.3f" + "\n", 
                    (distance(A, B) + distance(B, C) + distance(A, C)), 
                    (Math.abs((xB-xA)*(yC-yA) - (xC-xA)*(yB-yA))/2));
            }
        }
    }
}
