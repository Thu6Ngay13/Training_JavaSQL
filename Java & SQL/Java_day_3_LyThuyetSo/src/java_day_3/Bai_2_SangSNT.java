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
public class Bai_2_SangSNT {
    private static boolean[] prime = new boolean[10000005];
    private static void sang(){
        for(int i = 2; i <= 10000000; i++) prime[i] = true;
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i <= Math.sqrt(10000000); i++){
            if(prime[i]){
                for(int j = i*i; j <= 10000000; j += i)
                    prime[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; n = sc.nextInt();
        sang();
        for(int i = 2; i <= n; i++)
            if(prime[i]) System.out.print(i + " ");
    }
}
