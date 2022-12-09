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
public class Bai_8_SapXepNoiBot {
    private static void bubbleSort(int n, int A[]){
        for(int i = 0; i < n-1; i++){
            for(int j = 1; j < n-i; j++){
                if(A[j-1] > A[j]){
                    int x = A[j-1];
                    A[j-1] = A[j];
                    A[j] = x;
                }
            }
            System.out.print("Buoc " + (i+1) + ": ");
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
        bubbleSort(n, A);
    }
}
