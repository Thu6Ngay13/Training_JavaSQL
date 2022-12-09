/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_3;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_10_DemUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, p, e, m = 1000000000+7;
        long ans = 1;
        t = sc.nextInt();
        while(t-- != 0){
            p = sc.nextInt();
            e = sc.nextInt();
            ans = (ans*((e+1)%m))%m;
        }
        System.out.println(ans);
    }
}
