/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_1;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x1, y1;
            int x2, y2;
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
        double ans = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        System.out.printf("%.2f", ans);
        
    }
}
