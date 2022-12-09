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
public class Bai_23_TongUocSo {
    private static long dem(long n){
        long sum = 0;
        for(int i = 1; i <= Math.sqrt(n); i++)
            if(n % i == 0){
                sum += i;
                if(n/i != i) sum += n/i;
            }
       return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; n = sc.nextLong();
        System.out.println(dem(n));
    }
}
