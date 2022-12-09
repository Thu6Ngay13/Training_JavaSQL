/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_2_ViTriSoMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int minA = Integer.MAX_VALUE;
        int maxA = -Integer.MIN_VALUE;
        int p1 = -1;
        int p2 = -1;
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(a[i] > maxA){
                maxA = a[i];
                p1 = i;
            }
            if(a[i] <= minA){
                minA = a[i];
                p2 = i;
            }
        }
        System.out.println(p2 + " " + p1);
    }
}
