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
public class Bai_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, n;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        n = sc.nextInt();
        long A = (long)n + b - (long)2*a + c;
        long B = (long)n - (long)2*b + a + c;
        long C =  (long)n - (long)2*c + a + b;
        if(A >= 0 && B >= 0 && C >= 0 && A%3 == 0 && B%3 == 0 && C%3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
