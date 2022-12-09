/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_39_MissingCoinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        Arrays.sort(A);
        long sum = 1;
        boolean ok = true;
        for(int i = 0; i < n; i++){
            if(A[i] > sum){
                System.out.println(sum);
                ok = false;
                break;
            }
            else sum += A[i];
        }
        if(ok) System.out.println(sum);
        
    }
}
