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
public class Bai_15_ChuSoDauTien {
    private static long sum(long n){
        if(n < 10) return n;
        return sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sum(n));
    }
}
