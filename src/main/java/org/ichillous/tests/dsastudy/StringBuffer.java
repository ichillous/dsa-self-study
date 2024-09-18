package org.ichillous.tests.dsastudy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class StringBuffer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
			/*
                loop
                    if check pass
                        push
                    else
                        soup "None"
            */
            //Write your code here
            HashMap<Integer, String> map = new HashMap<>();
            boolean start = false;
            boolean end = false;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '<') {
                    start = true;
                } else if (line.charAt(i) == '>') {
                    end = true;
                }
                while (!start && !end) {
                    map.put(i, line.substring(i, i + 1));
                }
            }
            for (int i : map.keySet()) {
                System.out.println(map.get(i));
            }

            testCases--;
        }
    }
}
