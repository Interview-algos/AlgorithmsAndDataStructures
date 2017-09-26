package nihar;

import java.io.*;
import java.util.*;

/*
 * Java Program to find four different elements a,b,c and d of
 * array such that a+b = c+d
 */
//Class to represent a pair
 class pair
 {
     int first, second;
     pair(int f,int s)
     {
         first = f; 
         second = s;
     }
 };

class ArraySumSubset2
{
 
 public void findPairs(int arr[])
 {
     // Create an empty Hash to store mapping from sum to
     // pair indexes
     HashMap<Integer,pair> hm = new HashMap<Integer,pair>();
     int n=arr.length;

     // Traverse through all possible pairs of arr[]
     for (int i=0; i<n; ++i)
     {
         for (int j=i+1; j<n; ++j)
         {
             // If sum of current pair is not in hash,
             // then store it and continue to next pair
             int sum = arr[i]+arr[j];
             if (!hm.containsKey(sum))
                 hm.put(sum,new pair(arr[i],arr[j]));

             else // Else (Sum already present in hash)
             {
                 // Find previous pair
                 pair p = hm.get(sum);

                 // Since array elements are distinct, we don't
                 // need to check if any element is common among pairs
                 System.out.println("("+p.first+", "+p.second+
                                   ") and ("+arr[i]+", "+arr[j]+")");                
             }
         }
     }
 }

 // Testing program
 public static void main(String args[])
 {
     int arr[] = {3, 4, 7, 1, 2, 9, 8};
     ArraySumSubset2 a = new ArraySumSubset2();
     a.findPairs(arr);
 }
}
