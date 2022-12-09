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
public class Bai_10_SHinhTronNgoaiTiep {
    private double x;
    private double y;

    public Bai_10_SHinhTronNgoaiTiep(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public static double distance(Bai_10_SHinhTronNgoaiTiep p1, Bai_10_SHinhTronNgoaiTiep p2){
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
            Bai_10_SHinhTronNgoaiTiep A = new Bai_10_SHinhTronNgoaiTiep(xA, yA);
            Bai_10_SHinhTronNgoaiTiep B = new Bai_10_SHinhTronNgoaiTiep(xB, yB);
            Bai_10_SHinhTronNgoaiTiep C = new Bai_10_SHinhTronNgoaiTiep(xC, yC);
            double AB = distance(A, B);
            double AC = distance(A, C);
            double BC = distance(B, C);
            if(AB+BC <= AC || AB+AC <= BC || BC+AC <= AB) 
                System.out.println("INVALID");
            else{
                double S = Math.abs((xB-xA)*(yC-yA)-(xC-xA)*(yB-yA))/2.0;
                double R = (AB*BC*AC)/(4*S);
                System.out.printf("%.3f" + "\n", R*R*3.14);
            }
        }
    }
}
