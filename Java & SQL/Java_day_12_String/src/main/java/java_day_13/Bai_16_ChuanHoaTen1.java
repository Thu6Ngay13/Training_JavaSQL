/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_13;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 *
 * @author wwhac
 */
public class Bai_16_ChuanHoaTen1 {
    private static String chuanHoa_1(String x){
        String tmp = "";
        if(Character.isUpperCase(x.charAt(0))) tmp += x.charAt(0);
        else tmp += (char)(x.charAt(0) - 32);
        for(int i = 1; i < x.length(); i++){
            if(Character.isUpperCase(x.charAt(i)))
                tmp += (char)(x.charAt(i) + 32);
            else 
                tmp += x.charAt(i);
        }
        return tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String name = "";
        String birt = "";
        StringTokenizer x = new StringTokenizer(a, " ");
        StringTokenizer y = new StringTokenizer(b, "/");
        while(x.hasMoreTokens()){
            String tmp = x.nextToken();
            name += chuanHoa_1(tmp) + " ";
        }
        while(y.hasMoreTokens()){
            String tmp = y.nextToken();
            if(tmp.length() == 1) birt += "0" + tmp + "/";
            else if(tmp.length() == 2) birt += tmp + "/";
            else birt += tmp;
        }
        System.out.println(name);
        System.out.println(birt);
    }
}
