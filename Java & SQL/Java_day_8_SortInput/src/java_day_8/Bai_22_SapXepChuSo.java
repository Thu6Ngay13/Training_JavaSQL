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
public class Bai_22_SapXepChuSo {
    private static void process(int x, int[] number){
        while(x != 0){
            number[x%10] = 1;
            x /= 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] number = new int[10];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int x:A) process(x, number);
        for(int i = 0; i < 10; i++)
            if(number[i] != 0) System.out.print(i + " ");
    }
}
