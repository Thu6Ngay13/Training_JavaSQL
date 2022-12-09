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
public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();

        if(n % 2 == 0) System.out.println("YES");
        else System.out.println("NO");

        if(n % 3 == 0 && n % 5 == 0) System.out.println("YES");
        else System.out.println("NO");

        if(n % 3 == 0 && n % 7 != 0) System.out.println("YES");
        else System.out.println("NO");

        if(n % 3 == 0 || n % 7 == 0) System.out.println("YES");
        else System.out.println("NO");

        if(n > 30 && n < 50) System.out.println("YES");
        else System.out.println("NO");

        if(n >= 30 && (n % 3 == 0 || n % 5 == 0 || n % 2 == 0)) System.out.println("YES");
        else System.out.println("NO");

        int x = n%10;
        if(n >= 10 && n < 100 && (x == 2 || x == 3 || x == 5 || x == 7)) System.out.println("YES");
        else System.out.println("NO");

        if(n <= 100 && n % 23 == 0) System.out.println("YES");
        else System.out.println("NO");

        if(n < 10 || n > 20) System.out.println("YES");
        else System.out.println("NO");

        if((n%10)%3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
