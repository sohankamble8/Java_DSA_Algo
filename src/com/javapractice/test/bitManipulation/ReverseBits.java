package com.javapractice.test.bitManipulation;

public class ReverseBits {
  public static void main(String[] args) {
    int a = 3;
    int bits = (int)(Math.log(a)/Math.log(2))+1;
    System.out.println("Number of Bits of "+a+" is "+bits);
    int finalRes = 0;
    if(bits == 2)
    {
      bits = bits + 1;
    }
    int count[] = new int[bits];
    for (int i=0;i<count.length;i++)
    {
      if((a&1<<i)>0)
      {
        count[i] = 1;
        finalRes = finalRes + (int) (Math.pow(2, bits-1-i));
      }
      else {
        count[i] = 0;
      }
    }
    System.out.println("Final Number after bit reversal is "+finalRes);
  }
}
