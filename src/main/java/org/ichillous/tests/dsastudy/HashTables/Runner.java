package org.ichillous.tests.dsastudy.HashTables;

import java.util.Arrays;
import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        int[] a = {6 ,1, 7};
        int[] b = {3, 4 ,1};
        int[] x = {6 ,8, 7};
        int[] y = {3, 4 ,1};
        HashT hashT = new HashT();
        hashT.set("Jamal", 12);
        hashT.set("Jamal", 11);
        hashT.set("Kamal", 13);
        hashT.set("Amal", 15);

        System.out.println(itemInCommon(x, y));
        System.out.println(itemInCommon2(a, b));


    }
    public static boolean itemInCommon(int[] a, int[] b) {
        for (int i : a) {
            for(int j : b) {
                if (i == j) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean itemInCommon2(int[] a, int[] b) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : a) {
            map.put(i, true);
        }
        for (int i : b) {
            if(map.get(i) != null ) return true;
        }
        return false;
    }

}
