/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_7;

public class LyThuyet {
    /*
    Truy cap ra ngoai mang : error : No bound checking
    references type : kieu tham chieu, co the thay doi tren mang
    Arrays.fill(A, value): lam day mang A bang gia tri: value
    
    + sx tang dan
    int [] A = new int[n];
    Arrays.sort(a); 
    Arrays.sort(a, iter1, iter2); sx tang dan tren doan
    
    + sx giam dan
    Wrapper: (kieu Wrapper se lau hon kieu du lieu nguyen thuy nhu: int, long, ...)
    int: Integer
    long: Long
    Integer[] A = new Integer[n];
    Arrays.sort(a, Collections.reverseOrder());
    */
    
    /*
    +Binary search
    private static int f(int n, int A[]){
        int l = 0, r = n-1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] == x) return m;
            else if(A[m] < x) l = m+1;
            else r = m-1;
        }
        return -1;
    }
    */
    /*
    private static int firstPos(int n, int A[], int x){
        int l = 0;
        int r = n-1;
        int res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] == x){
                res = m;
                r = m-1;
            }
            else  if(A[m] < x) l = m+1;
            else r = m-1;
        }
        return res;
    }
    private static int lastPos(int n, int A[], int x){
        int l = 0;
        int r = n-1;
        int res = -1;
        while(l <= r){
            int m = (l+r)/2;
            if(A[m] == x){
                res = m;
                l = m+1;
            }
            else  if(A[m] < x) l = m+1;
            else r = m-1;
        }
        return res;
    }
    */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
