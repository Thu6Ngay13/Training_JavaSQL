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
public class Bai_29_sxSinhVien {
    private String Ma;
    private String Ten;
    private String Lop;
    private String Email;

    public Bai_29_sxSinhVien(String Ma, String Ten, String Lop, String Email) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.Lop = Lop;
        this.Email = Email;
    }

    public String getMa() {
        return Ma;
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
        Bai_29_sxSinhVien[] A = new Bai_29_sxSinhVien[n];
        for(int i = 0; i < n; i++){
            String Ma = sc.nextLine();
            String Ten = sc.nextLine();
            String Lop = sc.nextLine();
            String Email = sc.nextLine();
            A[i] = new Bai_29_sxSinhVien(Ma, Ten, Lop, Email);
        }
        Arrays.sort(A, new Comparator<Bai_29_sxSinhVien>(){
            @Override
            public int compare(Bai_29_sxSinhVien t, Bai_29_sxSinhVien t1) {
                if(t.getLop().compareTo(t1.getLop()) != 0)
                    return t.getLop().compareTo(t1.getLop());
                return t.getMa().compareTo(t1.getMa());
            }
        });
        for(Bai_29_sxSinhVien x:A)
            System.out.println(x);
    }
}
