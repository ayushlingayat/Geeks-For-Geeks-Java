//Counting elements in two arrays
//EasyAccuracy: 47.9%Submissions: 46724Points: 2
//Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates. For each element in arr1[] count elements less than or equal to it in array arr2[].
//
//Example 1:
//
//Input:
//m = 6, n = 6
//arr1[] = {1,2,3,4,7,9}
//arr2[] = {0,1,2,1,1,4}
//Output: 4 5 5 6 6 6
//Explanation: Number of elements less than
//or equal to 1, 2, 3, 4, 7, and 9 in the
//second array are respectively 4,5,5,6,6,6
//Example 2:
//
//Input:
//m = 5, n = 7
//arr1[] = {4,8,7,5,1}
//arr2[] = {4,48,3,0,1,1,5}
//Output: 5 6 6 6 3
//Explanation: Number of elements less than
//or equal to 4, 8, 7, 5, and 1 in the
//second array are respectively 5,6,6,6,3
//Your Task :
//Complete the function countEleLessThanOrEqual() that takes two array arr1[], arr2[],  m, and n as input and returns an array containing the required results(the count of elements less than or equal to it in arr2 for each element in arr1 where ith output represents the count for ith element in arr1.)
//
//Expected Time Complexity: O((m + n) * log n).
//Expected Auxiliary Space: O(1).
//
//Constraints:
//1<=m,n<=10^5
//1<=arr1[i],arr2[j]<=10^5

import java.util.ArrayList;
import java.util.Arrays;

public class Geeks_for_Geeks_15_part2 
{
	public static void main(String[] args) 
	{
		int a[]= {4,8,7,5,1};
		
		int b[]= {4,48,3,0,1,1,5};
		
		ArrayList<Integer> t=countEleLessThanOrEqual(a,b,a.length,b.length);
		
		System.out.println(t);
	}
	
	public static int bs(int a[],int val)
    {
        int l=0,r=a.length-1;
        
        while(l<=r)
        {
            int mid=(l+r)/2;
            
            if(a[mid]<=val)
            {
                l=mid+1;
            }
            
            else
            {
                r=mid-1;
            }
        }
        
        return l;
        
    }
    
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       
       Arrays.sort(arr2);
       
       ArrayList<Integer> a=new ArrayList<Integer>();
       
       for(int i=0;i<m;i++)
       {
           a.add(bs(arr2,arr1[i]));
       }
       
       return a;
    }

}
