/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LyThuyet_2;

import java.util.ArrayList;

/**
 *
 * @author wwhac
 */
public class MainLogin {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("abc", "abc"));
        list.add(new Account("abcd", "abcd"));
        new LoginForm(list);
    }
}
