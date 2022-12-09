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
public class Bai_20_DemSoThaoTac {
    private static int demTTac(int n){
        if(n == 1) return 0;
        int x = 100, y = 100, z = 100;
        if(n % 2 == 0) x = 1 + demTTac(n/2);
        if(n % 3 == 0) y = 1 + demTTac(n/3);
        z = 1 + demTTac(n-1);
        return Math.min(x, Math.min(y, z));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();
        System.out.println(demTTac(n));
    }
}
