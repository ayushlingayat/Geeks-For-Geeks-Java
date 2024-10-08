//Friends Pairing Problem
//Given N friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total 
//number of ways in which friends can remain single or can be paired up.
//Note: Since answer can be very large, return your answer mod 10^9+7.
//
//
//Example 1:
//
//Input:N = 3
//Output: 4
//Explanation:
//{1}, {2}, {3} : All single
//{1}, {2,3} : 2 and 3 paired but 1 is single.
//{1,2}, {3} : 1 and 2 are paired but 3 is single.
//{1,3}, {2} : 1 and 3 are paired but 2 is single.
//Note that {1,2} and {2,1} are considered same.
//Example 2: 
//
//Input: N = 2
//Output: 2
//Explanation:
//{1} , {2} : All single.
//{1,2} : 1 and 2 are paired.
//
//Your Task:
//You don't need to read input or print anything. Your task is to complete the function countFriendsPairings() which accepts an integer n 
//and return number of ways in which friends can remain single or can be paired up.
//
//
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
//
//
//Constraints:
//1 ≤ N ≤ 10^4

public class Geeks_for_Geeks_4 
{
	public static void main(String[] args) 
	{
		System.out.println("ways= "+count(3));

	}
	
	public static long count(int n)
	{
		long dp[]=new long[n+1],mod=(long) (Math.pow(10,9)+7);
		dp[0]=1;
		
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				dp[i]=1;
			}
			
			else
			{
				dp[i]=(dp[i-1]+(((i-1)*dp[i-2])%mod))%mod;
			}
		}
		
		return dp[n]%mod;
	}

}
