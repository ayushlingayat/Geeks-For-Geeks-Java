//Count Palindromic Subsequences
//MediumAccuracy: 49.32%Submissions: 83221Points: 4
//Given a string str of length N, you have to find number of palindromic subsequence (need not necessarily be distinct) which could be formed from the string str.
//Note: You have to return the answer module 109+7;
// 
//
//Example 1:
//
//Input: 
//Str = "abcd"
//Output: 
//4
//Explanation:
//palindromic subsequence are : "a" ,"b", "c" ,"d"
// 
//
//Example 2:
//
//Input: 
//Str = "aab"
//Output: 
//4
//Explanation:
//palindromic subsequence are :"a", "a", "b", "aa"
// 
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function countPs() which takes a string str as input parameter and returns the number of palindromic subsequence.
// 
//
//Expected Time Complexity: O(N*N)
//Expected Auxiliary Space: O(N*N)
//
//
//Constraints:
//1<=length of string str <=1000

import java.util.Arrays;

class Solution
{
    long countPS(String str)
    {
        // Your code here
        int n=str.length();
        
        long dp[][]=new long[n+1][n+1];
        
        for(long s[]:dp)
        {
            Arrays.fill(s,-1);
        }
        
        return solve(str,0,n-1,dp);
    }
    
    public long solve(String str,int i,int j,long [][]dp)
    {
        long m=(long)(Math.pow(10,9)+7);
        
        if(i>j)
        {
            return 0;
        }
        
        if(i==j)
        {
            return 1;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        
        if(str.charAt(i)==str.charAt(j))
        {
            dp[i][j]=(1+solve(str,i+1,j,dp)+solve(str,i,j-1,dp))%m;
        }
        
        else
        {
            dp[i][j]=(m+solve(str,i+1,j,dp)+solve(str,i,j-1,dp)-solve(str,i+1,j-1,dp))%m;
        }
        
        return dp[i][j];
    }
}