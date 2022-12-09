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
public class Bai_38_SoLuongUocCuaNGthua {

    private static boolean check(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void demUoc(int n) {
        long m = 1000000007;
        long sl = 1;
        for (int i = 2; i <= n; i++) {
            if (check(i)) {
                int cnt = 0;
                for (int j = i; j <= n; j *= i) {
                    cnt += n / j;
                }
                sl = (sl * (cnt + 1)) % m;
            }
        }
        System.out.println(sl);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        demUoc(n);
    }
}
