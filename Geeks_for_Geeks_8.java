//Longest Sub-Array with Sum K
//Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.
//Example 1:
//Input :
//A[] = {10, 5, 2, 7, 1, 9}
//K = 15
//Output : 4
//Explanation:
//The sub-array is {5, 2, 7, 1}.

import java.util.HashMap;

public class Geeks_for_Geeks_8 
{
	public static void main(String[] args) 
	{
		int a[]= {10,5,2,7,1,9};
		
		System.out.println(longest(a,a.length,15));
	}
	
	public static int longest(int a[],int n,int k)
	{
		HashMap<Integer,Integer> h=new HashMap<>();
		
		int res=0;
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
			
			if(sum==k)
			{
				res=Math.max(res,i+1);
			}
			
			if(h.containsKey(sum-k))
			{
				res=Math.max(res, i-h.get(sum-k));
			}
			
			if(!h.containsKey(sum))
			{
				h.put(sum, i);
			}
		}
		
		return res;
	}
	

}
