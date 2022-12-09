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
public class Bai_31 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2, a3, b1, b2, b3, n;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();
        b3 = sc.nextInt();
        n = sc.nextInt();
        int cup = a1 + a2 + a3;
        int hc = b1 + b2 + b3;
        int check = cup/5 + hc/10;
        if(cup %  5  != 0) check++;
        if(hc % 10 != 0) check++; 
        if(check <= n) System.out.println("YES");
        else System.out.println("NO");
    }
}
