/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_day_8;

/**
 *
 * @author wwhac
 */
public class LyThuyet {
/*
public static void selectionSort(int a[], int n){
        for(int i = 0; i < n; i++){
            //buoc thu i : Di tim phan tu nho nhat chua duoc sap xep va hoan vi voi a[i]
            int min_index = i;
            for(int j = i + 1; j < n; j++){
                if(a[j] < a[min_index]){
                    min_index = j;
                }
            }
            int tmp = a[i]; a[i] = a[min_index]; a[min_index] = tmp;
        }
    }
    
    public static void bubbleSort(int a[], int n){
        for(int i = 0; i < n; i++){
            //duyet cac phan tu chua duoc sap xep va dua phan tu lon nhat ve cuoi
            for(int j = 0; j < n - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }
public static void insertionSort(int a[], int n){
        for(int i = 1; i < n; i++){
            //Chen a[i] vao trong doan 0=>i-1
            //tim duoc vi tri chen
            int pos = i - 1;
            int giaTriChen = a[i];
            while(pos >= 0 && a[pos] > giaTriChen){
                a[pos + 1] = a[pos]; // dich phan tu o vi tri pos sang ben phai
                --pos;
            }
            a[pos + 1] = giaTriChen;
        }
    }
*/
    /*
    public static int firstPos(int a[], int n, int x){
        int res = -1;
        int left = 0, right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == x){
                res = mid;
                //tim kiem o ben trai xem con ko
                right = mid - 1;
            }
            else if(a[mid] < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return res;
    }
    */
    
    /*
    while(sc.hasNext()){
    }
    */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
