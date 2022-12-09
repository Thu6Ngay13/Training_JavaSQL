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
public class Bai_30_SCCuoiMax {
    private static boolean[] prime = new boolean[10000005];
    private static void sang(){
        for(int i = 2; i <= 10000001; i++) prime[i] = true;
        prime[0] = prime[1] = false;
        for(int i = 2; i <= Math.sqrt(10000001); i++)
            if(prime[i])
                    for(int j = i*i; j <= 10000001; j += i)
                        prime[j] = false;
    }
    private static boolean check(int n){
        int m = n%10;
        while(n != 0){
            if(n%10 > m) return false;
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int cnt = 0;
        sang();
        for(int i = 2; i <= n; i++)
            if(prime[i] && check(i)){
                System.out.print(i + " ");
                cnt++;
            }
        System.out.println("");
        System.out.println(cnt);
    }
}
