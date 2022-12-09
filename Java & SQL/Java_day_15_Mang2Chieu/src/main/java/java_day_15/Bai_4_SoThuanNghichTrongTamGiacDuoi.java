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
public class Bai_4_SoThuanNghichTrongTamGiacDuoi {
    private static boolean check(int n){
        int tmp = n;
        int m = 0;
        while(tmp != 0){
            m = m*10 + tmp%10;
            tmp /= 10;
        }
        return m == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(check(A[i][j])) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
