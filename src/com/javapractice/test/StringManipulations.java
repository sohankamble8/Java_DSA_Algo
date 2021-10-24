package com.javapractice.test;

import java.nio.charset.Charset;
import java.util.Scanner;

public class StringManipulations {

  public static String splitMe(String myString, int value_Of_K){

    if (myString.length() <= value_Of_K)
    {
      return myString;
    }
    else {
      return splitMe(myString.substring(0,value_Of_K),value_Of_K);
    }
  }

  public static void main(String args[])
  {
    System.out.println("Welcome Sohan.... Let's Start Practice for Amazon test");
    byte[] byte_array = {71, 101, 101, 107, 115};
    Charset charSet = Charset.defaultCharset();
    String newString = new String(byte_array, charSet);
    System.out.println(newString);

//    Working on String Manipulation Problem:
//    Given a string of lowercase alphabets, count all possible substrings (not necessarily distinct) that has exactly k distinct characters.
    //Examples:
    //
    //
    //Input: abc, k = 2
    //Output: 2
    //Possible substrings are {"ab", "bc"}
    //
    //Input: aba, k = 2
    //Output: 3
    //Possible substrings are {"ab", "ba", "aba"}
    //
    //Input: aa, k = 1
    //Output: 3
    //Possible substrings are {"a", "a", "aa"}
    System.out.println("Enter String");
    Scanner sc = new Scanner(System.in);
    String inputString = sc.nextLine();
    System.out.println("Enter Value of K");
    int k_Value = sc.nextInt();
    System.out.println("String parts are: "+splitMe(inputString, k_Value));
  }
}
