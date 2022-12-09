/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_4;

/**
 *
 * @author wwhac
 */
public class Lythuyet {
    /*
    + Eratosthenes
    private static boolean[]    prime = new boolean[1000000];
    private static void sang(){
        for(int i = 0; i <= 1000000; i++) prime[i] = true;
        prime[0] = prime[1] = false;
        for(int i = 2; i <= Math.sqrt(1000000); i++)
            if(prime[i])
                for(int j = i*i; j <= 1000000; j++)
                    prime[j] = false;
    }
    */
    /*
    + Luy thua nhi phan
    private static long luyThua(int a, int b){
        long res = 1;
        while(b != 0){
            if(b%2 != 0) res *= a;
            b /= 2;
            a *= a;
        }
        return res;
    }
    */
    /*
    nCk
    private static long nCk(int n, int k){
        k = Math.min(k, n-k);
        long res = 1;
        for(int i = 1; i <= k; i++)
            res = res*(n-i+1)/i;
        return res;
    }
    */
    /*
    Moduler Athetic
    (A+B)%C = ((A%C) + (B%C))%C
    (A-B)%C = ((A%C) - (B%C) + C)%C
    (A*B)%C = ((A%C) * (B%C))%C
    (A/B)%C = ((A%C) * (B^-1%C))%C
    (A^B)%C = ((A%C)^B)%C
    */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
