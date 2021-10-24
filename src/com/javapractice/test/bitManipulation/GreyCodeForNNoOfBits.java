package com.javapractice.test.bitManipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class GreyCodeForNNoOfBits {
  private static ArrayList<String> solution(int n)
  {
    if( n == 1)
    {
      ArrayList<String> finalList = new ArrayList<>();
      finalList.add("0");
      finalList.add("1");
      return finalList;
    }
    ArrayList<String> previousNbits = solution(n-1);
    ArrayList<String> finalList = new ArrayList<>();
    for(int i =0;i<previousNbits.size();i++)
    {
      String newString = previousNbits.get(i);
      finalList.add("0"+newString);
    }

    for(int i=0;i<previousNbits.size();i++)
    {
      String newString = previousNbits.get(i);
      finalList.add("1"+newString);
    }
    return finalList;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Number...");
    int num = scanner.nextInt();
    System.out.println("List of bits in "+num+" is "+solution(num));
  }
}
