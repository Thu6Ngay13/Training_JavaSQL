/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_day_18;

 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author wwhac
 */
public class Bai_32_lkSinhVien {
    private String Ma;
    private String Ten;
    private String Lop;
    private String Email;

    public Bai_32_lkSinhVien(String Ma, String Ten, String Lop, String Email) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Email = Email;
    }
    
    public void chuanHoa(){
        String[] x = this.Ten.split("\\s+");
        this.Ten = "";
        for(int i = 0; i < x.length; i++){
            this.Ten += Character.toUpperCase(x[i].charAt(0));
            for(int j = 1; j < x[i].length(); j++)
                this.Ten += Character.toLowerCase(x[i].charAt(j));
            this.Ten += " ";
        }
        this.Ten = this.Ten.trim();
    }

    public String getLop() {
        return Lop;
    }

    @Override
    public String toString() {
        return this.Ma + " " + this.Ten + " " + this.Lop + " " + this.Email;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        LinkedHashMap<Bai_32_lkSinhVien, String> map = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            String Ma = sc.nextLine();
            String Ten = sc.nextLine();
            String Lop = sc.nextLine();
            String Email = sc.nextLine();
            Bai_32_lkSinhVien x = new Bai_32_lkSinhVien(Ma, Ten, Lop, Email);
            x.chuanHoa();
            map.put(x, Ma.substring(0, 4));
        }
        int Q = sc.nextInt(); sc.nextLine();
        while(Q-- > 0){
            String KhoaHoc = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + KhoaHoc + " :");
            Set<Map.Entry<Bai_32_lkSinhVien, String>> entry = map.entrySet();
            for(Map.Entry<Bai_32_lkSinhVien, String> x:entry)
                if(x.getValue().equals(KhoaHoc))
                    System.out.println(x.getKey());
        }
    }
}
