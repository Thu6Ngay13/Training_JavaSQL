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
public class Bai_7_CapSoNgtoCungNhau {
    private static boolean check(int a, int b){
        while(b != 0){
            int x = a%b;
            a = b;
            b = x;
        }
        return a == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i <= b; i++){
            for(int j = i+1; j <= b; j++){
                if(check(i, j))
                        System.out.println("(" + i + "," + j + ")");
            }
        }
    }
}
