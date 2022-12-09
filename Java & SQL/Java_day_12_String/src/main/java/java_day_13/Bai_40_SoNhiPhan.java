/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_40_SoNhiPhan {
    private static boolean check(String s, int k){
        int sum = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int x = (s.charAt(i) - '0');
            int y = (int)Math.pow(2, (s.length()-1-i)%4);
            if(x != 0) sum += y;
        }
        System.out.println((sum%((int)Math.pow(2,k%4)))%k);
        return sum%5 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        if(check(s, k)) System.out.println("YES");
        else System.out.println("NO");
    }
} 
