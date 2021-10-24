package com.javapractice.test.maths;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class PalindromeNumbers {

  private static boolean isPalindrome(int n)
  {
    int temp  = n;
    int rem = 0;
    int newNo = 0;
    while(n>0)
    {
      rem = n%10;
      n = n/10;
      newNo = newNo * 10 + rem;
    }
//    if(newNo == temp)
//    {
//      return true;
//    }else {
//      return false;
//    }
    return newNo == temp;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number");
    int num = scanner.nextInt();
    if(isPalindrome(num))
    {
      System.out.println(num+" is Palindrome");
    }else {
      System.out.println(num+" is not Palindrome");
    }
  }
}
