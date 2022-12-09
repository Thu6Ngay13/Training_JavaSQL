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
public class Bai_8_TPrime {
    public static boolean checkNto(int x){
        if(x == 0 || x == 1) return false;
        for(int i = 2; i <= Math.sqrt(x); i++)
               if(x%i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(checkNto(i)) System.out.print((long)i*i + " ");
    }
}
