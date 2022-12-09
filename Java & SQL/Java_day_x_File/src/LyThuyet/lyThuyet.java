/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LyThuyet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wwhac
 */
public class lyThuyet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(new File("SinhVien.txt"));
            FileWriter out = new FileWriter("Email.txt", true);
            while(sc.hasNext()){
                String name = sc.nextLine();
                String birth = sc.nextLine();
                String[] x = name.split("\\s+");
                String[] y = birth.split("/");
                String ans = x[x.length-1-1].toLowerCase();
                for(int i = 0; i < x.length-1; i++) 
                    ans += Character.toLowerCase(x[i].charAt(i));
                ans += "28@land.edu.vn";
                String res = "";
                for(String i:y) res += i;
                out.write(ans + "\n");
                out.write(res + "\n");
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lyThuyet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
