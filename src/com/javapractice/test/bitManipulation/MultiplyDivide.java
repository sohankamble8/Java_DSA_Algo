package com.javapractice.test.bitManipulation;

public class MultiplyDivide {

  private static long multiPlyWithMultipleOf2(long a, long b)
  {
    return a<<b-1;
  }
  public static long divideWithMultipleOf2(long a, long b) {
    if (a == Integer.MIN_VALUE && b == -1) { return Integer.MAX_VALUE; }
    if (a == Integer.MAX_VALUE && b == 1) { return Integer.MAX_VALUE; }
    a = Math.abs(a);
    b = Math.abs(b);
    int result = 0;
    while (a - b >= 0) {
      int count = 0;
      while (a - (b << 1 << count) >= 0) {
        count++;
      }
      result = result + (1 << count);
      a = a - (b << count);
    }
    return ((a > 0 && b > 0) || (a < 0 && b < 0)) ? result : -result;
  }
  public static void main(String[] args) {

    long a = 10;
    long b = 2;
    System.out.println("Multiply "+a+" with "+b+" = "+multiPlyWithMultipleOf2(a, b));
    System.out.println("Divide "+a+" with "+b+" = "+ divideWithMultipleOf2(a, b));
    System.out.println(1<<2);
    System.out.println(6>6);
  }
}
