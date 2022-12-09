/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_day_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author wwhac
 */
public class LyThuyet {
    /*
    Kieu: ArrayList (giong vector trong C++)
    1./ Them, chen, xoa
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<Integer>();
    
    arr.add(value) : them vao 1 phan tu vao arraylist
    arr.size() : lay ra kich thuoc cua arraylist
    arr.get(index) : duyet cac phan tu trong arraylist
    arr.empty() : check xem arraylist co rong khong
    arr.clear() : xoa het phan tu trong arraylist
    arr.contains(value) : tim kiem tuyen tinh O(n)
    arr.remove(index) : xoa phan tu tai vi tri index
    
    co the dung for each : for(int x:arr)
    
    2./ Sap xep arraylist
    2.1./ Collections.sort(arr) : sap xep tang dan
    2.2./ sap xep theo 1 cai comparator : tim sort : merge sort + insertion sort : co tinh stable
        ArrayList<Integer> arr2 = new ArrayList<>();
        Collections.sort(arr2, new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                if(t < t1) return -1;
                return 1;
            }
        });
    */
    
    /*
    Kieu: Set
        Them, chen, xoa
    1./ HashSet : khong co thu tu
        Set<Integer> set = new HashSet<>();
        
    set.add(value) : them gia tri
    set.remove(value) : xoa mot gia tri
    set.contains(value) : tim kiem gia tri
    set.size() : lay ra kich thuoc
        
    2./ LinkedHashSet : co thu tu cua nhung gia tri duoc them vao
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
    set.add(value) : them gia tri
    set.remove(value) : xoa mot gia tri
    set.contains(value) : tim kiem gia tri
    set.size() : lay ra kich thuoc
        
    3./ TreeSet : Co thu tu tang dan theo thu tu tu dien
        TreeSet<Integer> set = new TreeSet<>();
        
    set.add(value) : them gia tri
    set.remove(value) : xoa mot gia tri
    set.contains(value) : tim kiem gia tri
    set.size() : lay ra kich thuoc
    set.first() : in ra phan tu dau tien : gia tri min
    set.last() : in ra phan tu cuoi cung : gia tri max
    set.lower(value) : tra ve phan tu max < value
    set.floor(value) : tra ve phan tu max <= value
    set.higher(value) : tra ve phan tu min >  value
    set.ceiling(value : tra ve phan tu min >=  value
    ...
    */
    
    /*
    Kieu : Map
    Co 3 dang nhu Set.
    1./ HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
    map.put(key, value) : them gia tri
    map.size() : lay ra kich thuoc cua map
    map.remove(key) : xoa mot key nao do
    map.contains(key) : kiem tra key co ton tai khong
    map.get(key) : -> op la mot value cua key
        Duyet map
    Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
    for(Map.Entry<Integer, Integer> x : entry){
        System.out.println(x.getkey() + " " + x.getValue());
    }
    2./ LinkedHashMap
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    chi thay doi value khi co 2 key giong nhau thu tu van giu nguyen
    3./ TreeMap
        TreeMap<Integer, Integer> map = new TreeMap<>();
    ...
    map.firstEntry() : lay ra cap key, value dau tien
    map.firstEntry().getKey() : lay ra cap key
    map.firstEntry().getValue() : lay ra cap value
    map.firstKey() : lay ra cap key dau tien
    map.lastEntry() : lay ra cap key, value cuoi cung
    map.lastKey() : lay ra cap key cuoi cung
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(3, 1);
        map.put(4, 2);
        map.put(5, 2);
        map.put(3, 2);
        Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
        for(Map.Entry<Integer, Integer> x:entry){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
