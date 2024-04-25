package com.example.hoctap.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HaspMap {

    public static void main(String[] args) {

        //Sử dụng HashMap trong Java

        /*

            HashMap có công dụng là lưu các giá trị dưới dạng Key value

            - Thời gian truy cập nhanh
            - Lưu giá trị dưới các cặp khóa giá trị, các cặp khóa này lưu dưới dạng Key value
            - Cho phép các giá trị trùng lặp

         */
        HashMap<Integer, String> haspMap = new HashMap<>();

        haspMap.put(1, "A");
        haspMap.put(2, "B");
        haspMap.put(3, "C");
        haspMap.put(4, "D");

        //Duyệt lấy ra các giá trị phần tử cua HashMap

        //Trong đó keySet dùng để duyệt thứ tự có trong HashMap và get để lấy ra thông tin


        System.out.println("Cac gia tri key value có trong HashMap :");
        for (Integer key : haspMap.keySet()) {

            System.out.println("Key : " + key + " Value : " + haspMap.get(key));

        }

        System.out.println("Tra ve mảng Map entry");
        for (Map.Entry<Integer , String> entry : haspMap.entrySet()){

            System.out.println(entry.getKey() + "- " + entry.getValue());

        }

        System.out.println("Lấy ra các phần tử của HashMap");
        System.out.println("Phan tử thứ 1 của map là: "+ haspMap.get(1));
        System.out.println("Phần tử thứ 2 của map là: "+ haspMap.get(2));

        System.out.println("Cập nhật phần tử thứ 2 trong HashMap: ");
        haspMap.put(2,"Anh yeu");

        System.out.println(haspMap);
        haspMap.remove(4);

        haspMap.clear();

        if (haspMap.isEmpty()) {
            System.out.println("HashMap đã được clear !");
        }
    }
}
