/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_2;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean ok = false;
        for(int i = 0; i < n; i++){
            long x = sc.nextInt();
                 if( x == 2022)
                     ok = true;
        }
        if(ok == true) System.out.println("YES");
        else System.out.println("NO");
    }
}
