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
public class Bai_6_SapXepChon {
    private static void selectionSort(int n, int A[]){
        for(int i = 0; i < n-1; i++){
            int mIndex = i;
            for(int j = i+1; j < n; j++)
                if(A[j] < A[mIndex])
                    mIndex = j;
            int tmp = A[i];
            A[i] = A[mIndex];
            A[mIndex] = tmp;
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
        selectionSort(n, A);
    }
}
