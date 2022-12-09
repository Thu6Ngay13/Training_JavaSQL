/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author wwhac
 */
public class Bai_26_NhanVien {
    private static int Count = 0;
    private int Ma;
    private String Name;
    private String Sex;
    private String Birth;
    private String Address;
    private String Tax;
    private String Enrol;

    public Bai_26_NhanVien(String Name, String Sex, String Birth, String Address, String Tax, String Enrol) {
        Count++;
        this.Ma = Count;
        this.Name = Name;
        this.Sex = Sex;
        this.Birth = Birth;
        this.Address = Address;
        this.Tax = Tax;
        this.Enrol = Enrol;
    }

    public int getMa() {
        return Ma;
    }
    
    public String getBirth() {
        return this.Birth;
    }
    
    private static String ChuanHoa(String x){
        String[] y = x.split("/");
        if(y[0].length() == 1) y[0] = "0" + y[0];
        if(y[1].length() == 1) y[1] = "0" + y[1];
        return y[0] + "/" + y[1] + "/" + y[2];
    }
    
    @Override
    public String toString() {
        String x = Integer.toString(this.Ma);
        String str = x;
        for(int i = 0; i < 5 - x.length(); i++) str = "0" + str;
        return str + " " + this.Name + " " + this.Sex + " " + ChuanHoa(this.Birth) + " " + 
            this.Address + " " + this.Tax + " " + ChuanHoa(this.Enrol);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Bai_26_NhanVien[] A = new Bai_26_NhanVien[n];
        for(int i = 0; i < n; i++){
            String Name = sc.nextLine();
            String Sex = sc.nextLine();
            String Birth = sc.nextLine();
            String Address = sc.nextLine();
            String Tax = sc.nextLine();
            String Enrol = sc.nextLine();
            A[i] = new Bai_26_NhanVien(Name, Sex, Birth, Address, Tax, Enrol);
        }
        Arrays.sort(A, new Comparator<Bai_26_NhanVien>(){
            @Override
            public int compare(Bai_26_NhanVien t, Bai_26_NhanVien t1) {
                String[] x = t.getBirth().split("/");
                int[] xx = new int[3];
                for(int i = 0; i < 3; i++)
                    xx[i] = Integer.parseInt(x[i]);
                
                String[] y = t1.getBirth().split("/");
                int[] yy = new int[3];
                for(int i = 0; i < 3; i++)
                    yy[i] = Integer.parseInt(y[i]);
                
                if(xx[2] != yy[2]) return xx[2] - yy[2];
                if(xx[1] != yy[1]) return xx[1] - yy[1];
                if(xx[0] != yy[0]) return xx[0] - yy[0];
                return t.getMa() - t1.getMa();
            }
        });
        for(Bai_26_NhanVien x:A)
            System.out.println(x);
    }
    
}
