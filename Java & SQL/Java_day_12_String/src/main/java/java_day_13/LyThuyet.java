/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_day_13;

import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class LyThuyet {
    /*
    String : Immutable : khong the chinh sua duoc
    
    String s = sc.nextLine(); khai bao
    String a = "abcd";
    String b = "bc";
    String ab = a + b;
    String ab_ = a.concat(b); giong a + b
    
    + s.length() : lay ra kich thuoc 
    + for(int i = 0; i < s.length(); i++) : duyet s
        sout(s.charAt(i));
    + if(a.equals(b)): kiem tra 2 xau
         sout("giong nhau");
    + sout(a.indexOf(b)); xuat ra bi tri cua xau b trong xau a
    + string ss = s.replaceAll("bc", "Python") thay the xau "bc" = "Python"
    + sout(a.compareTo(b)) : so sanh 2 xau theo thu tu tu dien
    + sout(a.compareToIgnoreCase(b)) : so sanh 2 xau theo thu tu tu dien bo qua IN va thuong
    + Character.isDigit(s.charAt(i)) : check co phai la digit khong
    + Character.isLowerCase(s.charAt(i)) : check co phai la lower khong
    + Character.isUpperCase(s.charAt(i)) : check co phai la upper khong
    */
    
    /*
    StringBuilder
    
    String s = "abcd123ABCD";
    StringBuilder sb = new StringBuider(s)
    string tmp = sb.substring(4, 8);
    sout(tmp);
    
    ps String toUpper(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(tmp);
            if(Character.isLowerCase(tmp)
                tmp -= 32;
            res += tmp;
        }
        return res;
    }
    
    ps String toLower(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(tmp);
            if(Character.isUpperCase(tmp)
                tmp += 32;
            res += tmp;
        }
        return res;
    }
    */
    
    /*
    StringTokenizer
    String s = "Nguyen Van Nam";
    StringTokenizer st = new StringTokenizer(s);
    String s = "Nguyen ^ *** Van - Nam";
    StringTokenizer st = new StringTokenizer(s, "^*-");
    while(st.hasMoreToken()){
        sout(st.nextToken());
    }
    String s = "Nguyen   Van   Nam";
    String[] arr = s.split(" ");
    String[] arr = s.split("\\s+");
    for(int i = 0; i < arr.length; i++)
        sout(arr[i]);
    */
    
    /*
    String s = "ababbsbasbnanb!$#%@11421342";
    int[] cnt = new int[256];
    for(int i = 0; i < s.length(); i++)
        cnt[s.charAt(i)]++;
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        c1: int c = Integer.parseInt(sc.nextLine());
        c2: int c = sc.nextInt();
        c2: sc.nextLine();
        String b = sc.nextLine();
        */
        String a = "a";
        String b = "b";
        //check a co thu tu tu dien lon hon b : 
        //op : > 0 : true
        //op : < 0 : false
        //op : 0 : a == b
        System.out.println(b.compareTo(a));
        
    }
}
