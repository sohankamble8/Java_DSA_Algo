package com.javapractice.test.bitManipulation;

import java.util.Scanner;

public class NOfBitsToCovertAtoB {

  public static int findNoOfOnes(long n)
  {
    int res = 0;
    int j=1;
    for(int i=1;i<=n;i++)
    {
      while(j>0)
      {

        j = j & (j-1);
        res++;
      }
      j = j+i+1;
      if(res >= Integer.MAX_VALUE)
      {
        res = res%1000000007;
      }
    }
    return res;
  }

  public static long findNumOfBitsTobeChange(long n1, long n2)
  {
    long new_No = n1^n2;
    return findNoOfOnes(new_No);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter A..");
    long a = scanner.nextLong();
    System.out.println("Enter B..");
    long b = scanner.nextLong();
    System.out.println("Number of Bits needs to be change to convert "+a+" to "+b+" is "+findNumOfBitsTobeChange(a, b));
    System.out.println("Set Bits count for "+a+" is "+findNoOfOnes(a)%1000000007);
  }
}
