//Fact Digit Sum
//A(X) for positive integer X is the sum of factorials of its digits. For example, A(154) = 1! + 5! + 4!= 145.
//Given a number N, find the minimum number X such that A(X) = N. You have to return a list of digits which represent the number X.
//
//Example 1:
//
//Input: N = 40321
//Output: 18
//Explanation: A(18)=1!+ 8! =40321 
//Note that A(80) and A(81) are also 
//40321, But 18 is the smallest 
//number.
//Example 2:
//
//Input: N = 5040
//Output: 7
//Explanation: A(7) = 7! = 5040.
//Your Task:
//You don't need to read or print anything. Your task is to complete the function FactDigit() which takes N as input parameter and returns a list of digits which represent the number X.
//
//Expected Time Complexity: O(X) where X ≤ 106
//Expected Space Complexity: O(X)
//
//Constraints:
//1 ≤ N ≤ 109


import java.util.ArrayList;
import java.util.Collections;

public class Geeks_for_Geeks_6 {

	public static void main(String[] args) 
	{
		int N =40321;
		
		System.out.print(fact(N));		
	}
	
	static ArrayList<Integer> fact(int N)
	{
		ArrayList<Integer> ans= new ArrayList<>();
		getDigits(N,ans);
		Collections.sort(ans);
		
		return ans;
	}
	
	public static void getDigits(int n,ArrayList<Integer> list)
	{
		if(n<=0)
		{
			return;
		}
		
		int d=1,sum=1;
		
		while(sum*(d+1)<=n && d<9)
		{
			sum+=sum*d;
			d++;
		}
		
		list.add(d);
		getDigits(n-sum,list);
	}
}
