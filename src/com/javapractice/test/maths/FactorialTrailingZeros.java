package com.javapractice.test.maths;

import java.util.Scanner;

public class FactorialTrailingZeros {
  private static long factorial(int n)
  {
    if(n == 1 || n == 0)
    {
      return 1;
    }
//    long fact = 1;
//    for (int i=1;i<=n;i++)
//    {
//      fact = fact * i;
//    }
    return n * factorial(n-1);
  }
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = scanner.nextInt();
    int res = 0;
    for (int i=5;i<=num;i = i*5)
    {
      res = res + num/i;
    }
    System.out.println("Factorial of "+num+" is "+factorial(num));
    System.out.println("Trailing Zeros count of "+num+" is "+res);
    long end = System.currentTimeMillis();
    System.out.println("Execution Time : "+(end-start));
  }
}
