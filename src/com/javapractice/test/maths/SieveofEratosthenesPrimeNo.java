package com.javapractice.test.maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenesPrimeNo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = scanner.nextInt();
    boolean[] isPrime = new boolean[num+1];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;

    for (int i=2;i*i<=num;i++)
    {
      for (int j=2*i;j<=num;j+=i)
      {
        isPrime[j] = false;
      }
    }

    for (int i=0;i<isPrime.length;i++)
    {
      if(isPrime[i] == true)
      {
        System.out.println(i+" is Prime "+isPrime[i]);
      }
    }
  }
}
