package com.javapractice.test.bitManipulation;

import java.util.Scanner;

public class FindBitsInGivenNumber {
  public static long findBits(long n)
  {
    return (long) (Math.log(n)/Math.log(2))+1;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number");
    long num = scanner.nextLong();
    System.out.println("Number of bits in "+num+" is "+findBits(num));
  }
}
