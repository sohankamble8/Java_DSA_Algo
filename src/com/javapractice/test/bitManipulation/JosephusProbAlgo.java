package com.javapractice.test.bitManipulation;

import java.util.Scanner;

public class JosephusProbAlgo {

  private static int powOf(int a)
  {
    int i = 1;
    while(i * 2 <=a)
    {
      i = i*2;
    }
    return i;
  }

  private static int josephusSpecial(int n)
  {
    int highestPower = powOf(n);
    int l = n - highestPower;
    return 2 * l +1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number ");
    int num = sc.nextInt();
    System.out.println("Josephus Special Problem Solution for "+num+" is "+josephusSpecial(num));

  }
}
