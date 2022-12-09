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
public class Bai_50_MayPhoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        long cnt = 1;
        long xx = 0, yy = 0;
        while(cnt < n){
            if(xx < yy+Math.max(x, y)) xx += Math.min(x, y);
            else yy += Math.max(x, y);
            cnt++;
        }
        long ans = Math.min(x, y) + Math.max(xx, yy);
        System.out.println(ans);
    }
}
