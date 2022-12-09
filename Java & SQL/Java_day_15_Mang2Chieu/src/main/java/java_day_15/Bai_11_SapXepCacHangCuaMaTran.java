/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_11_SapXepCacHangCuaMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        Integer[][] A = new Integer[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        for(int i = 0; i < n; i++){
            Arrays.sort(A[i], new Comparator<Integer>(){
                @Override
                public int compare(Integer t, Integer t1) {
                    return t - t1;
                }
            });
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print(A[i][j] + " ");
            System.out.println("");
        }
    }
}
