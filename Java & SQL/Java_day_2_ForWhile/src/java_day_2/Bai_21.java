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
public class Bai_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1;  j <= n; j++)
                System.out.print(n*(i-1)+j + " ");
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1;  j <= n; j++){
                System.out.print(i + j - 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1;  j <= n; j++){
                if(j >= n+1-i) System.out.print(i);
                else System.out.print("~");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1; i <= n; i++){
            int x = i;
            for(int j = 1;  j <= i; j++){
                System.out.print(x + " ");
                x += n-j;
            }
            System.out.println();
        }
    }
}
