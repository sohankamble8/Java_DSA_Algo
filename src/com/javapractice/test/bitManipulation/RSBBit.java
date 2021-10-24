package com.javapractice.test.bitManipulation;

public class RSBBit {
  public static void main(String[] args) {
    int a = 15;
    int rsb = a & -a;
    System.out.println("RSB of "+a+" is "+rsb);
  }
}
