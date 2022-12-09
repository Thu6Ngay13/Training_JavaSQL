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
public class Bai_4_SNTx {
     private static boolean checkSnt(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
               if(n % i == 0) return false;
        return true;
    }
     private static boolean checkCso(int n){
         while(n != 0){
             int x = n%10;
             n /= 10;
             if(x != 2 && x != 3 && x != 5 && x != 7) return false;
         }
         return true;
     }
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a, b, cnt = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i <= b; i++){
            if(checkSnt(i) && checkCso(i)) cnt++;
        }
         System.out.println(cnt);
    }
}

