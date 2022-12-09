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
public class Bai_6_SoThuanNguyenTo {
    public static boolean checkNto(int x){
        if(x == 0 || x == 1) return false;
        for(int i = 2; i <= Math.sqrt(x); i++)
               if(x%i == 0) return false;
        return true;
    }
    private static boolean checkCso(int x){
        int a = 0;
        while(x != 0){
            int tmp = x%10;
            if(tmp != 2 && tmp != 3 && tmp != 5 && tmp != 7) return false;
            a += tmp;
            x /= 10;
        }
        return checkNto(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++)
            if(checkCso(i) && checkNto(i)) cnt++;
        System.out.println(cnt);
    }
}
