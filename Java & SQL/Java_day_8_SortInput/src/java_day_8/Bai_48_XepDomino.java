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
public class Bai_48_XepDomino {
    private static boolean f(int n, int a, int b, long side){
        long x = side/a;
        long y = side/b;
        return (double)x >= ((double)n)/y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        long l = (long)(Math.sqrt(1l*Math.min(a, b)*Math.min(a, b)*n)),
            r = 1l*Math.max(a, b)*n, 
            ans = -1;
        while(l <= r){
            long m = (l+r)/2;
            if(f(n, a, b, m)){
                ans = m;
                r = m-1;
            }
            else l = m+1;
        }
        System.out.println(ans);
    }
}
