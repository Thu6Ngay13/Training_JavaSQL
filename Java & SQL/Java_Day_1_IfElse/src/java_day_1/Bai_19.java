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
public class Bai_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        long ans = (long)(m/a)*(n/a);
        if(n%a != 0) ans += m/a;
        if(m%a != 0) ans += n/a;
        if(n%a != 0 && m%a != 0) ans++;
        if(n < a || m < a) System.out.println(1);
        else System.out.println(ans);
    }
}
