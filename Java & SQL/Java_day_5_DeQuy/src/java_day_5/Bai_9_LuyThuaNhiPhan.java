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
public class Bai_9_LuyThuaNhiPhan {
    private static long M = 1000000007;
    private static long lThua(long a, long b){
        if(b == 0) return 1;
        long x = lThua(a, b/2);
        if(b%2 == 0) return ((x%M)*(x%M))%M;
        return (((x%M)*(x%M)%M)*a)%M;
    }
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(lThua(a, b));
    }
}
