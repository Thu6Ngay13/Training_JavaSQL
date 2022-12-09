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
public class Bai_7_nCk {
    private static long nCk(int n, int k){
        if(k == n || k == 0) return 1;
        return nCk(n-1, k-1) + nCk(n-1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(nCk(n, k));
    }
}
