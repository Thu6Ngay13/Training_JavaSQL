/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_15;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_8_HoanVi2CotCuaMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        int u = sc.nextInt()-1;
        int v = sc.nextInt()-1;
        for(int i = 0; i < n; i++){
            int tmp = A[i][u];
            A[i][u] = A[i][v];
            A[i][v] = tmp;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
              System.out.print(A[i][j] + " ");
            System.out.println("");
        }
    }
}
