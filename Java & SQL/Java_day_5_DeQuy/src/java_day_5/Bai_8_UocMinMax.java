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
public class Bai_8_UocMinMax {
    private static long UCLN(long a, long b){
        if(b == 0) return a;
        return UCLN(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long UC = UCLN(a, b);
        long BC = a/UC*b;
        System.out.println(a + " " + b);
    }
}
