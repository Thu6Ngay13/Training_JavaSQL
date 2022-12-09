/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_21_DaySoUuThe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int c = 0;
        int l = 0;
        while(sc.hasNext()){
            int x = sc.nextInt();
            n++;
            if(x%2 == 0) c++;
            else l++;
        }
        if((n%2 == 0 && c > l) || (n%2 == 1 && l >c)) System.out.println("YES");
        else System.out.println("NO");
    }
}
