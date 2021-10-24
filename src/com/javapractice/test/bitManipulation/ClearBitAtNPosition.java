package com.javapractice.test.bitManipulation;

import java.util.Scanner;

public class ClearBitAtNPosition {
  public static long clearBit(long n, long pos)
  {
    long j = 0;
    long mask = 0;
    while (j <= pos)
    {
      mask = 1L <<j;
      j++;
    }
        if ((n ^ mask) != 0)
        {
          return n ^ mask;
        }
        else {
          return 0;
        }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number..");
    long num = scanner.nextLong();
    System.out.println("Enter Bit Position..");
    long pos = scanner.nextLong();
    System.out.println("After Clearing Bit for "+num+" At "+pos+" new Number is "+clearBit(num, pos));
  }
}
