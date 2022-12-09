/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

 
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_5_NhanVien {
    private String Name;
    private String Sex;
    private String Birth;
    private String Address;
    private String Tax;
    private String Enrol;
    private static String ChuanHoa1(String x){
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
    private static String ChuanHoa2(String x){
        String[] y = x.split(" ");
        String z = "";
        for(int i = 0; i < y.length; i++){
            z += Character.toUpperCase(y[i].charAt(0));
            for(int j = 1; j < y[i].length(); j++)
                z += Character.toLowerCase(y[i].charAt(j));
            if(i != y.length-1) z += " ";
        }
        return z;
    }
    public Bai_5_NhanVien(String Name, String Sex, String Birth, String Address, String Tax, String Enrol) {
        this.Name = ChuanHoa2(Name);
        this.Sex = Sex;
        this.Birth = ChuanHoa1(Birth);
        this.Address = Address;
        this.Tax = Tax;
        this.Enrol = ChuanHoa1(Enrol);
    }

    @Override
    public String toString(){
        return "00001 " + this.Name + " " + this.Sex + " " 
            + this.Birth + " " + this.Address + " " + this.Tax + " " + this.Enrol;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        String Sex = sc.nextLine();
        String Birth = sc.nextLine();
        String Address = sc.nextLine();
        String Tax = sc.nextLine();
        String Enrol = sc.nextLine();
        Bai_5_NhanVien x = new Bai_5_NhanVien(Name, Sex, Birth, Address, Tax, Enrol);
        System.out.println(x);
    }
}

