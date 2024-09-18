package org.ichillous.tests.dsastudy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Factoral {
    public static void main(String[] args) {
        factorial(25);
    }
    public static void factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for( int i = 1; i <= n; i++ ) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
        Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();

    }

}
