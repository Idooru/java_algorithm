package org.example.doit.chap01.mytry;

import java.util.HashMap;
import java.util.Map;

public class Gauus {

    static int a = 4;
    static int b = 6;
    static Map<Integer, Integer> swapMap;

    public static void main(String[] args) {
        if (a > b) {
          swapMap = swap(a, b);
          a = swapMap.get(0);
          b = swapMap.get(1);
        }

        int result = sumof(Gauus.a, Gauus.b);
        System.out.println(result);
    }

    static int sumof(int a, int b) {
        int first = a;
        int last = b;
        return (first + last) * (last - first + 1) / 2;
    }

    static Map<Integer, Integer> swap(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        Map<Integer, Integer> swapMap = new HashMap<>();

        swapMap.put(0, a);
        swapMap.put(1, b);
        return swapMap;
        
    }
}
