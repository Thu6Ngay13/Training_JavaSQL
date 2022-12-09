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
public class Bai_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2, k3, k5, k6;
        k2 = sc.nextInt();
        k3 = sc.nextInt();
        k5 = sc.nextInt();
        k6 = sc.nextInt();
        int x = Math.min(Math.min(k2, k5), k6);
        long ans =  (long)256*x;
        if(k2 -  x > 0 && k3 > 0) ans +=  (long)Math.min(k2 -  x, k3)*32;
        System.out.println(ans);
    }
}
