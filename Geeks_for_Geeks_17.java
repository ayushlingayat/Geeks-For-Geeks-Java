//Alternate positive and negative numbers
//EasyAccuracy: 49.41%Submissions: 58225Points: 2
//Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
//Note: Array should start with positive number.
// 
//
//Example 1:
//
//Input: 
//N = 9
//Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
//Output:
//9 -2 4 -1 5 -5 0 -3 2
//Explanation : Positive elements : 9,4,5,0,2
//Negative elements : -2,-1,-5,-3
//As we need to maintain the relative order of
//postive elements and negative elements we will pick
//each element from the positive and negative and will
//store them. If any of the positive and negative numbers
//are completed. we will continue with the remaining signed
//elements.The output is 9,-2,4,-1,5,-5,0,-3,2.
//
//
//Example 2:
//
//Input: 
//N = 10
//Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
//Output:
//5 -5 2 -2 4 -8 7 1 8 0 
//Explanation : Positive elements : 5,2,4,7,1,8,0
//Negative elements : -5,-2,-8
//As we need to maintain the relative order of
//postive elements and negative elements we will pick
//each element from the positive and negative and will
//store them. If any of the positive and negative numbers
//are completed. we will continue with the remaining signed
//elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
//
//
//Your Task:  
//You don't need to read input or print anything. Your task is to complete the function rearrange() which takes the array of integers arr[] and n as parameters. You need to modify the array itself.
//
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
//
//Constraints:
//1 ≤ N ≤ 107
//-106 ≤ Arr[i] ≤ 107


import java.util.LinkedList;
import java.util.Queue;

class Solution {
    void rearrange(int arr[], int n) {
        // code here
        
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                q1.add(arr[i]);
            }
            
            else
            {
                q2.add(arr[i]);
            }
        }
        
        int j=0;
        
        while(j<n)
        {
            if(!q1.isEmpty())
            {
                arr[j++]=q1.poll();
            }
            
            if(!q2.isEmpty())
            {
                arr[j++]=q2.poll();
            }
        }
    }
}
