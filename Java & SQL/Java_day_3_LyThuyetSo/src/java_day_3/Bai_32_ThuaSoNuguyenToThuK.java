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
public class Bai_32_ThuaSoNuguyenToThuK {
    private static int solve(int n, int k){
        int check = 0;
        for(int i = 2; i <= Math.sqrt(n); i++){
                while(n % i == 0){
                    check++;
                    if(check == k) return i;
                    n/= i;
                }
            }
        if(k == check+1 && n > 1) return n;
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int k = sc.nextInt();
        System.out.println(solve(n, k));
        
    }
}
