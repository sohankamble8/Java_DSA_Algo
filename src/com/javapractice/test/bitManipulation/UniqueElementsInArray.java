package com.javapractice.test.bitManipulation;

public class UniqueElementsInArray {
  public static void main(String[] args) {

    int[] a = {1, 2, 2, 11, 1, 23, 10, 23, 11};
    int res = 0;

    //For Single Unique Element
    for (int i = 0;i<a.length;i++)
    {
      res = res^a[i];
    }
    System.out.println("Unique Number is "+res);

//    For 2 Unique numbers
//    Step 1: Get XOR of all elements of array
//    Step 2: Check Position of Right most 1 in Step 1 result.
//    Step 3: Check elements from array which have same positional 1 in bits as Step 2.
//    Step 4: XOR filtered elements from Step 3 with Step 1 result..Then we get first unique element.
//    Step 5: XOR Step 1 result with Step 4 result.
    int[] b = {1, 2, 2, 11, 1, 23, 10, 23, 11, 12};
    int res1 = 0;
    int[] arr = new int[b.length];
//    Step 1:
    for (int i = 0;i<b.length;i++)
    {
      res1 = res1^b[i];
    }
    int temp = res1;
    int noOfBits = (int) ((Math.log(res1)/Math.log(2))+1);
//    Step 2:
    int pos = 0;
    for (int i=0;i<noOfBits;i++)
    {
      if((res1 & (1<<i)) > 0)
      {
        pos=i;
        break;
      }
    }
    System.out.println("temp after first operation is "+temp);
//    Step 3:
    if((temp&(1<<pos))>0)
    {
      for(int i =0;i<b.length;i++)
      {
//        Step 4:
        if((b[i]&(1<<pos))>0)
        {
          res1 = res1^b[i];
        }
      }
    }

//    Got first Unique element
    arr[0] = res1;
//    Step 5: Got Second unique element
    arr[1] = res1^temp;
    System.out.println("First unique no is "+arr[0]);
    System.out.println("Second unique no is "+arr[1]);
    //    arr[1]=res1;

    //  For 1 Unique number out of array which consist of 3 repeated elements
    /*
    * Steps:
    * Step 1: Identify the max number bits of array
    * Step 2: Make array of 32 size for all numbers positional bit count
    * Step 3: Then get reminder after division of each number by 3 in array of Step 2 to get Unique number from array as its binary form.
    * Step 4: Finally covert than Binary form to decimal using formula ex: 101 = (1*2 power of 0) + (0 * 2 power of 1) + (1 * 2 power of 2) = 5    * */
    int c[] ={1, 1, 3, 1, 32, 3, 3};
    int count[] = new int[32];
    int j = 0;
//    Step 1:
    for( int i=0;i<c.length;i++)
    {
      int bits = (int) (Math.log(c[i])/Math.log(2))+1;
      if(bits > j)
      {
        j = bits;
      }
//      Step 2:
      for(int k=0;k<bits;k++)
      {
        if((c[i]&(1<<k)) !=0)
        {
          count[k]++;
        }
      }
    }
//    Step 3:
    int finalRes = 0;
    int tarr[] = new int[j];
    for (int i=j-1;i>=0;i--){
//      Getting Binary Form
        tarr[j-1-i] = count[i]%3;
        count[i] = count[i]%3;
      finalRes = finalRes +(int) (Math.pow(2,i)) * count[i];
    }
    for(int i=0;i<tarr.length;i++)
    {
      System.out.print(tarr[i]+" ");
    }
    System.out.println("Final Binary to Decimal is "+finalRes);
  }


}
