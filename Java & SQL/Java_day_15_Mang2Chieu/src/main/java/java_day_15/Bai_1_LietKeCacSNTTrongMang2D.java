package java_day_15;

import java.util.Scanner;

public class Bai_1_LietKeCacSNTTrongMang2D {
    public static boolean check(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                if(check(A[i][j]))
                    System.out.print(A[i][j] + " ");
            System.out.println();
        }

    }
}
