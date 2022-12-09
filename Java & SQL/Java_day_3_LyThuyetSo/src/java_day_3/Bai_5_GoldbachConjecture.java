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
public class Bai_5_GoldbachConjecture {

    public static boolean checkNto(int x) {
        if (x == 0 || x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void goldBach(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (checkNto(i) && checkNto(n - i)) {
                System.out.println(i + " " + (n - i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- != 0) {
            int n;
            n = sc.nextInt();
            goldBach(n);
        }
    }
}
