package com.javapractice.test.LGquestions;

import java.util.logging.Logger;

//Write a program to reverse an array or string
//Solution Link:
//Time Complexity : O(n)
public class ReverseArray {
  private static final Logger LOGGER = Logger.getLogger("Sohan Logger");
  //  ******************* Effective Solution for Array Reversal ******************
  public static void reverseArray(int[] a) {
    System.out.println("*********** Effective Solution for Array Reversal *************");
    System.out.println("Main Array");
    for (int i : a) {
      System.out.print(i + " ");
    }
    int start = 0;
    int end = a.length - 1;
    while (end > start) {
      a[start] = a[start] + a[end];
      a[end] = a[start] - a[end];
      a[start] = a[start] - a[end];
      start++;
      end--;
    }
    System.out.println();
    System.out.println("Reversed Array");
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
  //  ******************* Effective Solution for String Reversal ******************

  public static void reverseString(String s) {
    System.out.println("*************** Effective Solution for String Reversal ***************");
    System.out.println("Main String : " + s);
    int start = 0;
    char[] charArray = s.toCharArray();
    int end = charArray.length - 1;
    StringBuilder temp = new StringBuilder();
    while (end > start) {
      char tempChar = charArray[start];
      charArray[start] = charArray[end];
      charArray[end] = tempChar;
      start++;
      end--;
    }
    for (char ch : charArray) {
      temp.append(ch);
    }
    System.out.println("Reversed String : " + temp.toString());
  }
  public static void main(String[] args) {
    int[] arr = {9, 2, 1, 4};
    String name = "Sohan";
    int[] temp = new int[arr.length];
    arrayReversalBruteForceSolution(arr, temp);
    stringReversalBruteForceSolution(name);
    //    ****************** Effective Solution Execution ********************
    reverseArray(arr);
    System.out.println();
    reverseString(name);

  }
  private static void stringReversalBruteForceSolution(String name) {
    //    String Reversal : BruteForce Solution
    System.out.println("****************** String Reversal : BruteForce Solution ******************");
    char[] charArray = name.toCharArray();
    String reversedString = "";
    for (int i = charArray.length - 1; i >= 0; i--) {
      reversedString += charArray[i];
    }
    System.out.println("Main String : " + name);
    System.out.println("Reversed String : " + reversedString);
  }
  private static void arrayReversalBruteForceSolution(int[] arr, int[] temp) {
    //    Array Reversal : BruteForce Solution
    System.out.println("******************* Array Reversal : BruteForce Solution *******************");
    for (int i = arr.length - 1; i >= 0; i--) {
      temp[arr.length - (i + 1)] = arr[i];
    }
    System.out.println("Main Array");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("Reversed Array");
    for (int i : temp) {
      System.out.print(i + " ");
    }
  }

}
