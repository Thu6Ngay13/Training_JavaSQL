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
public class Bai_19_CheckTraChuSoChan {
    private static boolean check(long n){
        if(n < 10) return n%2  == 0;
        if((n%10)%2 != 0) return false;
        return check(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(check(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
