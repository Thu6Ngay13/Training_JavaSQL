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
public class Bai_13_BacCuaThuaSoNguyenToTrongNGThua {
    private static long solve(long n, int p){
        long ans = 0;
        for(long i = p; i <= n; i*= p)
               ans += n/i;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        int p;
        n = sc.nextLong();
        p = sc.nextInt();
        System.out.println(solve(n, p));
    }
}
