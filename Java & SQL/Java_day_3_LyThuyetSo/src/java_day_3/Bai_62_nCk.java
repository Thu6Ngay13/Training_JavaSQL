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
public class Bai_62_nCk {
    private static long[] F = new long[1000005];
    private static long powMod(long a, long b, long m){
        long res = 1;
        while(b != 0){
            if(b % 2 == 1) res = res*a%m;
            a = (a*a)%m;
            b /= 2;
        }
        return res;
    }
    public static void main(String[] args) {
        int M = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        F[0] = 1;
        for(int i = 1; i < 1000005; i++)
            F[i] = 1l*i*F[i-1]%M;
        long tu = F[n];
        long mau = powMod(F[n-k]*F[k]%M, M-2, M);
        System.out.println((tu*mau)%M);
        
    }
}
