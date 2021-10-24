package com.javapractice.test.bitManipulation;

public class KernighanAlgoForCountSetBits {
  public static int count(int n)
  {
    int finalRes = 0;
    int rsb = 0;

    while(n>0)
    {
      rsb = n & -n;
      n = n - rsb;
      finalRes++;
    }
    return finalRes;
  }

  public static int largestPowerOf2inRaange(int n)
  {
    int a = 0;
    while((1<<a) <=n)
    {
      a++;
    }
    return a-1;
  }
  public static int solve(int A) {
    if(A == 0)
    {
      return 0;
    }
    int n = largestPowerOf2inRaange(A);
    int bits2powerA = n * (1<<(n-1));
    int msbPowertillA = A - (1<<n)+1;
    int rest = A - (1<<n);

    //    int bits2powerA = ((n%m) * (1<<(n-1)%m))%m;
    //    int msbPowertillA = ((A%m) - (((1<<n)+1)%m))%m;
    //    int rest = ((A%m) - ((1<<n)%m))%m;
    int m = 1000000007;
    int result = bits2powerA + msbPowertillA + solve(rest);
    return result;
  }
  public static void main(String[] args) {
    int M = 1000000007;
    int num = 1000000000;
    int temp = num;
//    int count = 0;
//    int rsb = 0;
//    while (temp>0){
//      rsb = temp & -temp;
//      temp = temp - rsb;
//      count++;
//    }
    System.out.println(" No of Set Bits in "+num+" is "+solve(num));
    System.out.println("Expected output : 846928043" );
    System.out.println(" 2' Complement of "+num+" is "+(-num));
    System.out.println("Integer Max Value : "+Integer.MAX_VALUE);
  }

}
