package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Input : ");
        int n = in.nextInt();
        long fib[] = new long[n];

        fib[0] = 1;
        fib[1] = 1;

        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];

        }
      System.out.println("Output : ");
        long q = 0;
        for (int i = 0; i < n; i++) {
            q = fib[i] + q;

        }
        System.out.println(q);

    }
}
