/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_1;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();
        if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
