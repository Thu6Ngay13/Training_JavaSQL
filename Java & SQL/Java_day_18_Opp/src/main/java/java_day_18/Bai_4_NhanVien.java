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
public class Bai_4_NhanVien {
    private String Name;
    private String Sex;
    private String Birth;
    private String Address;
    private String Tax;
    private String Enrol;
    private static String ChuanHoa(String x){
        String[] y = x.split("/");
        String z = "";
        if(y[0].length() == 1) y[0] += "0" + y[0];
        if(y[1].length() == 1) y[1] += "0" + y[1];
        return y[0] + "/" + y[1] + "/" + y[2];
    }
    public Bai_4_NhanVien(String Name, String Sex, String Birth, String Address, String Tax, String Enrol) {
        this.Name = Name;
        this.Sex = Sex;
        this.Birth = ChuanHoa(Birth);
        this.Address = Address;
        this.Tax = Tax;
        this.Enrol = ChuanHoa(Enrol);
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
        Bai_4_NhanVien x = new Bai_4_NhanVien(Name, Sex, Birth, Address, Tax, Enrol);
        System.out.println(x);
    }
}
