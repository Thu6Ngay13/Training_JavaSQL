/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_5;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_18_TongChanLe {
    private static void f(long n, long c, long l){
        if(n == 0){
            System.out.println(c);
            System.out.println(l);
        }
        else if((n%10)%2 == 0) f(n/10, c+(n%10), l);
        else f(n/10, c, l+(n%10));
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        f(n, 0, 0);
    }
}
