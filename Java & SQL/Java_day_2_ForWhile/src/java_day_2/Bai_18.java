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
public class Bai_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans = 0;
        while(n != 0){
            long x = n % 10;
            if(x == 2 || x == 3 || x == 5 || x == 7) ans++;
            n /= 10;
        }
        System.out.println(ans);
    }
}
