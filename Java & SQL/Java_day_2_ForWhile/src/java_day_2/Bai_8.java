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
public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for(int i = 3; i <= n; i++)
            if(i % 3 == 0) ans += (long)i;
        System.out.println(ans);
    }
}
