package com.javapractice.test.bitManipulation;

import java.util.Scanner;

public class NumOfBits {

  public static int findBits(long a)
  {
    int count = 0;
    while(a > 0)
    {
      a = a & (a-1);
      count++;
    }
    return count;
  }

  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number..");
    long num = scanner.nextLong();
    System.out.println("Number of Bits in "+num+" is "+findBits(num));

  }
}
