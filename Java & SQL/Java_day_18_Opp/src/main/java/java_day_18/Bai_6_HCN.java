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
public class Bai_6_HCN {
    private int Width;
    private int Height;
    private String Color;

    public Bai_6_HCN(int Width, int Height, String Color) {
        this.Width = Width;
        this.Height = Height;
        this.Color = Color;
    }    

    @Override
    public String toString(){
        return (this.Width + this.Height)*2 + " " + (this.Width * this.Height)
            + " " + this.Color;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Width = sc.nextInt();
        int Height = sc.nextInt();
        String Color = sc.next();
        if(Width <= 0 || Height <= 0) System.out.println("INVALID");
        else{
            Bai_6_HCN x = new Bai_6_HCN(Width, Height, Color);
            System.out.println(x);
        }
    }
}
