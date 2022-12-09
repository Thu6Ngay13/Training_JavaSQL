/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_3;
import java.util.Scanner;
/**
 *
 * @author wwhac
 */
public class Bai_36_TamGiacPascal {
    private static long[][] ps = new long[105][105];
    private static void pacal(int n){
        long x = 1000000007;
        ps[0][0] = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i){
                    System.out.print(1 + " ");
                    ps[i][j] = 1;
                }
                else{
                    ps[i][j] = (ps[i-1][j]%x + ps[i-1][j-1]%x)%x;
                    System.out.print(ps[i][j] + " ");
                }
            }
        System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();
        pacal(n);
    }
}
