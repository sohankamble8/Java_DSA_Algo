package com.javapractice.test.bitManipulation;

public class EvenOdd {

  public static void main(String[] args)
  {
    int num = 11;
    if((num & 1) == 0)
    {
      System.out.println("Number "+num+" is Even Number");
    }
    else{
      System.out.println("Number "+num+" is Odd Number");
    }
  }
}
