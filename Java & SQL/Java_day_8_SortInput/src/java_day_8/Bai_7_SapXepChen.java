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
public class Bai_7_SapXepChen {
    private static void insertionSort(int n, int A[]){
        for(int i = 1; i < n; i++){
            int pos = i-1;
            int val = A[i];
            while(pos >= 0 && A[pos] > val){
                A[pos+1] = A[pos];
                pos--;
            }
            A[pos+1] = val;
            System.out.print("Buoc " + i + ": ");
            for(int x:A)
                System.out.print(x + " ");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++) A[i] = sc.nextInt();
        insertionSort(n, A);
    }
}
