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
public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(n/i == i) ans *= i;
                else ans *= n;
            }
        }
        System.out.println(ans);
    }
}
