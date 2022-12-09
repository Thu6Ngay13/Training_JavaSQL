/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_25_SoLonNhatNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        if((m > 1 && s == 0) || m*9 < s)  System.out.println("NOT FOUND");
        else{
            String maxN = "";
            String minN = "";
            int x = s;
            int y = s-1;
            for(int i = 0; i < m; i++){
                if(x > 9){
                    maxN += "9";
                    x -= 9;
                }
                else{
                    maxN += (char)(x + '0');
                    x -= x;
                }
            }
            for(int i = 0; i < m-1; i++){
                if(y > 9){
                    minN = "9" + minN;
                    y -= 9;
                }
                else{
                    minN = (char)(y + '0') + minN;
                    y -= y;
                }
            }
            minN = (char)(y+1+'0') + minN;
            System.out.println(minN);
            System.out.println(maxN);
        }
    }
}
