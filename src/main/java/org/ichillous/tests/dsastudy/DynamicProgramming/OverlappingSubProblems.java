package org.ichillous.tests.dsastudy.DynamicProgramming;

public class OverlappingSubProblems {
    public static void main(String[] args) {
        /*
            Optimized Sub Problems & Sub Structures
                10
            A ------ B
            |        |
         30 |        | 15
            |        |
            C ------ D
                20
           Highest cost path vs Lowest Cost Path
           A -> D
           Lowest Cost: A, B, D
        */

        int n =7;
        System.out.println("fib of " + n + " is " + fib2(n));
        System.out.println(counter);
    }

    // fibonacci sequence O(2^n)
    static int counter = 0;
    public static int fib(int n) {
        counter++;
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
    static Integer[] memo = new Integer[100];
    public static int fib2(int n) {
        if(memo[n] != null){
            return memo[n];
        }
        if (n == 0 || n == 1) {
            return n;
        }
        counter++;
        memo[n] = fib2(n - 1) + fib2(n - 2);
        return memo[n];
    }
}
