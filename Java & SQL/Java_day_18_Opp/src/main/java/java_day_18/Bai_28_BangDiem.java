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
public class Bai_28_BangDiem {
    private static int Count = 0;
    private int Ma;
    private String Ten;
    private double Toan;
    private double TiengViet;
    private double Anh;
    private double Ly;
    private double Hoa;
    private double Sinh;
    private double Su;
    private double Dia;
    private double GiaoDuc;
    private double CongNghe;

    public Bai_28_BangDiem(String Ten, double Toan, double TiengViet, double Anh, double Ly, double Hoa, double Sinh, double Su, double Dia, double GiaoDuc, double CongNghe) {
        Count++;
        this.Ma = Count;
        this.Ten = Ten;
        this.Toan = Toan;
        this.TiengViet = TiengViet;
        this.Anh = Anh;
        this.Ly = Ly;
        this.Hoa = Hoa;
        this.Sinh = Sinh;
        this.Su = Su;
        this.Dia = Dia;
        this.GiaoDuc = GiaoDuc;
        this.CongNghe = CongNghe;
    }

    public static int getCount() {
        return Count;
    }

    public double getToan() {
        return Toan;
    }

    public double getTiengViet() {
        return TiengViet;
    }

    public double getAnh() {
        return Anh;
    }

    public double getLy() {
        return Ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public double getSinh() {
        return Sinh;
    }

    public double getSu() {
        return Su;
    }

    public double getDia() {
        return Dia;
    }

    public double getGiaoDuc() {
        return GiaoDuc;
    }

    public double getCongNghe() {
        return CongNghe;
    }

    @Override
    public String toString() {
        String x = Integer.toString(this.Ma);
        while(x.length() < 2) x = "0" + x;
        x = "HS" + x;
        double TB = (this.Toan + this.TiengViet + this.Anh + this.Ly + this.Hoa
            + this.Sinh + this.Su + this.Dia + this.GiaoDuc + this.CongNghe)/10;
        String XepLoai = "YEU";
        if(TB >= 9) XepLoai = "XUAT SAC";
        else if(TB >= 8) XepLoai = "GIOI";
        else if(TB >= 7) XepLoai = "KHA";
        else if(TB >= 5) XepLoai = "TB";
        return x + " " + this.Ten + " " + String.format("%.1f", TB) + " " + XepLoai;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Bai_28_BangDiem[] A = new Bai_28_BangDiem[n];
        for(int i = 0; i < n; i++){
            String Ten = sc.nextLine();
            double Toan = sc.nextDouble();
            double TiengViet = sc.nextDouble();
            double Anh = sc.nextDouble();
            double Ly = sc.nextDouble();
            double Hoa = sc.nextDouble();
            double Sinh = sc.nextDouble();
            double Su = sc.nextDouble();
            double Dia = sc.nextDouble();
            double GiaoDuc = sc.nextDouble(); 
            double CongNghe = sc.nextDouble(); sc.nextLine();
            A[i] = new Bai_28_BangDiem(Ten, Toan, TiengViet, Anh, Ly, Hoa, Sinh, Su, Dia, GiaoDuc, CongNghe);
        }
        Arrays.sort(A, new Comparator<Bai_28_BangDiem>(){
            @Override
            public int compare(Bai_28_BangDiem t, Bai_28_BangDiem t1) {
                double o = (t.getToan() + t.getTiengViet() + t.getAnh() + t.getLy() + t.getHoa()
                    + t.getSinh() + t.getSu() + t.getDia() + t.getGiaoDuc() + t.getCongNghe())/10;
                double o1 = (t1.getToan() + t1.getTiengViet() + t1.getAnh() + t1.getLy() + t1.getHoa()
                    + t1.getSinh() + t1.getSu() + t1.getDia() + t1.getGiaoDuc() + t1.getCongNghe())/10;
                if(o1 >= o) return  1;
                return -1;
            }
        });
        for(Bai_28_BangDiem x:A)
            System.out.println(x);
    }
    
}
