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
public class Bai_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int k = -1;
        for(int i = n/2; i >= 0; i--){
            if((n-i)%m == 0){
                k = n-i;
                break;
            }
        }
        System.out.println(k);
    }
}
