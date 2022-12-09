/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author wwhac
 */
public class Bai_3_SinhVien {
    private String HoTen;
    private String Lop;
    private String NgaySinh;
    private float GPA;
    private static String ChuanHoa(String x){
        x = x.replaceAll("/", " ");
        String[] y = x.split(" ");
        String z = "";
        for(int i = 0; i < y.length; i++){
            if(y[i].length() == 1) z += "0" + y[i] + "/";
            else if(y[i].length() == 2) z += y[i] + "/"; 
            else z += y[i];
        }
        return z;
    }
    public Bai_3_SinhVien(String HoTen, String Lop, String NgaySinh, float GPA){
        this.HoTen = HoTen;
        this.Lop = Lop;
        this.NgaySinh = ChuanHoa(NgaySinh);
        this.GPA = GPA;
    }
    @Override
    public String toString(){
        return "SV001 " + this.HoTen + " " + this.Lop + " " + this.NgaySinh + " " + this.GPA;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        float d = sc.nextFloat();
        Bai_3_SinhVien x = new Bai_3_SinhVien(a, b, c, d);
        System.out.println(x);
    }
}
