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
public class Bai_27_TinhGio {
    private String user;
    private String password;
    private String name;
    private String input;
    private String output;

    public Bai_27_TinhGio(String user, String password, String name, String input, String output) {
        this.user = user;
        this.password = password;
        this.name = name;
        this.input = input;
        this.output = output;
    }

    public String getUser() {
        return user;
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    @Override
    public String toString() {
        int hh = ((this.output.charAt(0) - '0')*10 + this.output.charAt(1) - '0')
            - ((this.input.charAt(0) - '0')*10 + this.input.charAt(1) - '0');
        int mm = ((this.output.charAt(3) - '0')*10 + this.output.charAt(4) - '0')
            - ((this.input.charAt(3) - '0')*10 + this.input.charAt(4) - '0');
        if(mm < 0){
            hh--;
            mm = (mm+60);
        }
        return this.user + " " + this.password + " " + this.name + " " +
            hh + " gio " + mm + " phut ";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Bai_27_TinhGio[] A = new Bai_27_TinhGio[n];
        for(int i = 0; i < n; i++){
            String user = sc.nextLine();
            String password = sc.nextLine();
            String name = sc.nextLine();
            String input = sc.nextLine();
            String output = sc.nextLine();
            A[i] = new Bai_27_TinhGio(user, password, name, input, output);
        }
        Arrays.sort(A, new Comparator<Bai_27_TinhGio>(){
            @Override
            public int compare(Bai_27_TinhGio t, Bai_27_TinhGio t1) {
                int hh = ((t.getOutput().charAt(0) - '0')*10 + t.getOutput().charAt(1) - '0')
                    - ((t.getInput().charAt(0) - '0')*10 + t.getInput().charAt(1) - '0');
                int mm = ((t.getOutput().charAt(3) - '0')*10 + t.getOutput().charAt(4) - '0')
                    - ((t.getInput().charAt(3) - '0')*10 + t.getInput().charAt(4) - '0');
                if(mm < 0){
                    hh--;
                    mm = (mm+60);
                }
                int hh1 = ((t1.getOutput().charAt(0) - '0')*10 + t1.getOutput().charAt(1) - '0')
                    - ((t1.getInput().charAt(0) - '0')*10 + t1.getInput().charAt(1) - '0');
                int mm1 = ((t1.getOutput().charAt(3) - '0')*10 + t1.getOutput().charAt(4) - '0')
                    - ((t1.getInput().charAt(3) - '0')*10 + t1.getInput().charAt(4) - '0');
                if(mm1 < 0){
                    hh1--;
                    mm1 = (mm1+60);
                }
                if(hh != hh1) return hh1 - hh;
                if(mm != mm1) return mm1 - mm;
                return t.getUser().compareTo(t1.getUser());
            }
        });
        for(Bai_27_TinhGio x:A)
            System.out.println(x);
    }
}
