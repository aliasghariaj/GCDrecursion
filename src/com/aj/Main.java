package com.aj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] array;

    public static void main(String[] args) {
        readBuffer();

        System.out.print(getBMM2(array[0], array[1]));
    }

    //Method_1 that calculate greatest common divisor of 2 number using recursion
    private static int getBMM(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;

        if (a > b) {
            return getBMM(a - b, b);
        }

        return getBMM(a, b - a);
    }

    //Method_2 that calculate greatest common divisor of 2 number using recursion
    private static int getBMM2(int a, int b) {
        if (a % b <= 1) return b;
        int temp;
        temp = a % b;
        a = b;
        b = temp;
        return getBMM2(a, b);
    }

    private static void readBuffer() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = null;
        try {
            lines = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] strs = lines.trim().split("\\s+");

        array = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            array[i] = Integer.parseInt(strs[i]);
        }
    }
}
