/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_day_3;

public class Lythuyet_Ham {
    /*
        public static returnType functionName(parameter){
            //code
        }
        public static void xinChao(int n){
            System.out.println("Gia tri cua tham so la : " + n);
        }
        int, long, float, double, char, ...
        void 
    */
    
    /*
        int x = Math.sqrt(n) + 0.5;
    */
    
    /*
        tong uoc
        public static int tongUoc(int n){
            int sum = 0;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(n%i == 0){
                    sum += i;
                    if(i != n/i) sum += n/i;
                }
            }
            return sum;
        }
    */
    
    /*
        private static int gcd(int a, int b){
            while(b != 0){
                a = b;
                b = a%b;
            }
            return a;
        }
    */
    
    /*
        private static int lcm(int a, int b){
            return a/gcd(a, b)*b;
        }
    */
    
    /*
        legandree
        private static int bacGiaiThua(int n, int p){
            int ans = 0;
            for(int i = p; i <= n; i *=  p)
                   ans += n/i;
            return ans;
        }
    */
    public static void main(String[] args) {
        //main
    }
}
