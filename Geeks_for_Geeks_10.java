//Sum of two large numbers
//MediumAccuracy: 47.9%Submissions: 20052Points: 4
//Given two strings denoting non-negative numbers X and Y. Calculate the sum of X and Y.
//
//
//Example 1:
//
//Input:
//X = "25", Y = "23"
//Output:
//48
//Explanation:
//The sum of 25 and 23 is 48.
//Example 2:
//
//Input:
//X = "2500", Y = "23"
//Output:
//2523
//Explanation:
//The sum of 2500 and 23 is 2523.
//
//Your Task:
//Your task is to complete the function findSum() which takes two strings as inputs and returns the string without leading zeros. You do not need to take any input or print anything.
//
//
//Expected Time Complexity: O(|X| + |Y|)
//Expected Auxiliary Space: O(1)
//
//
//Constraints:
//1 <= |X|, |Y| <= 105

public class Geeks_for_Geeks_10 
{
	public static void main(String[] args) 
	{
		String a="0002500",b="230";
		
		System.out.println(sum(a,b));
	}
	
	public static String sum(String a,String b)
	{
//		int c=Integer.parseInt(a)+Integer.parseInt(b);
//		
//		String v=Integer.toString(c);
//		
//		String s[]=new String[v.length()];
//		
//		int j=0;
//		
//		for(int i=a.length()-1;i>=0;i--)
//		{
//			if(s[i])
//		}
//		
//		return Integer.toString(c);
		
		
		String ans="";
		int i=a.length()-1;
		int j=b.length()-1;
		
		int c=0;
		int sum=0;
		
		while(i>=0||j>=0||c!=0)
		{
			sum=c;
			
			if(i>=0)
			{
				sum+=a.charAt(i)-'0';
				i--;
			}
			
			if(j>=0)
			{
				sum+=b.charAt(j)-'0';
				j--;
			}
			
			ans=sum%10+ans;
			c=sum/10;
		}
		
		i=0;
		
		while(i<ans.length())
		{
			if(ans.charAt(i)=='0')
			{
				i++;
			}
			
			else
			{
				break;
			}
		}
		
		return i==ans.length()?"0":ans.substring(i);
	}

}
