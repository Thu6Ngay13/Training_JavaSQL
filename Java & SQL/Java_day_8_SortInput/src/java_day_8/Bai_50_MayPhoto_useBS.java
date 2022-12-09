/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_8;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_50_MayPhoto_useBS {
    private static boolean f(int n, int x, int y, long time){
        long m1 = time/x;
        long m2 = time/y;
        return (m1+m2) >= (n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long l = 1l*(n-1)/2*Math.min(x, y), r = 1l*(n-1)*Math.max(x, y), ans = -1;
        while(l <= r){
            long time = (l+r)/2;
            if(f(n, x, y, time)){
                ans = time;
                r = time-1;
            }
            else l = time+1;
        }
        System.out.println(ans+Math.min(x, y));
    }
}
