package com.javapractice.test.bitManipulation;

public class InverseBits {
  public static void main(String[] args) {
    int a = 8;
    int b = ~ a;
    int i = 0;
    int noOfBits = (int) (Math.log(a)/Math.log(2)+1);
    while(i<=noOfBits)
    {

    }
    System.out.println("A is "+a+" B is "+b);
  }
}
