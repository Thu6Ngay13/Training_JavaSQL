/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_9;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_12_SuffixAndQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] F = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        for(int i = n-1;i >= 0; i--){
            set.add(A[i]);
            F[i] = set.size();
        }
        int q = sc.nextInt();
        while(q-- != 0){
            int l = sc.nextInt();
            System.out.println(F[l]);
        }
    }
}
