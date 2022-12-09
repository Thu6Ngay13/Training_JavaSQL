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
public class Bai_14_DemChuSo0LienTiepTinhTuCuoiVe {
    private static long solve(long n){
        long x = 0;
        for(long i = 5; i <= n; i *= 5)
               x = (x + (n/i % 1000000007)) % 1000000007;
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; n = sc.nextLong();
        System.out.println(solve(n));
    }
}
