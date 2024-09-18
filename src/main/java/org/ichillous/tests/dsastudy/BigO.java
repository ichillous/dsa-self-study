package org.ichillous.tests.dsastudy;

public class BigO {
    public static void main(String[] args) {
        int[] a = {2 , 4, 6 , 8};
        int[] b = {1, 3, 5, 7};
        multiple(a, b);
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiple(int[] a, int[] b) {
        int sum = 0;
        int j = 0;
        int k = 0;
        for (int x : a){
            for (int y : b){
                System.out.println(x + y);
                j += x;
                k += y;
                sum += j + k;
            }
        }
        System.out.println("Sum = " + sum);
        return sum;
    }

}

