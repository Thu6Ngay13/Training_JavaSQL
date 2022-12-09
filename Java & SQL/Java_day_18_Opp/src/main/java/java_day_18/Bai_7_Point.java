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
public class Bai_7_Point {
    private double x;
    private double y;

    public Bai_7_Point(){}
    public Bai_7_Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Bai_7_Point(Bai_7_Point p){
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    
    public static double distance(Bai_7_Point p1, Bai_7_Point p2){
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double a = x1-x2;
        double b = y1-y2;
        return Math.sqrt(a*a + b*b);
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while(tt-- != 0){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            Bai_7_Point p1 = new Bai_7_Point(x1, y1);
            Bai_7_Point p2 = new Bai_7_Point(x2, y2);
            double k = distance(p1, p2);
            System.out.printf("%.4f" + "\n", k);
        }
    }
}
