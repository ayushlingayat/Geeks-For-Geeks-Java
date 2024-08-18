//Given a string S consisting of uppercase and lowercase characters. The task is to sort uppercase and lowercase letters separately such that if the 
//ith place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.
//Input:
//N = 12
//S = defRTSersUXI
//Output: deeIRSfrsTUX
//Explanation: Sorted form of given string
//with the same case of character as that
//in original string is deeIRSfrsTUX

import java.util.Arrays;

public class Geeks_for_Geeks_2
{

	public static void main(String[] args) 
	{
		String s="defRTSersUXI";
		
		int n=s.length();
		
		System.out.println("Sorted String= "+caseSort(s,n));
	}
	
	public static String caseSort(String s,int n)
	{
		if(n>=1 && n<=Math.pow(10,5))
		{
			int e=0,f=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='a' && s.charAt(i)<='z')
				{
					e++;
				}
				
				else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					f++;
				}
			}
			
			char c1[]=new char[e];
			char c2[]=new char[f];
			
			char c5[]=new char[s.length()];
			
			int j=0,k=0,l=0,m=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='a' && s.charAt(i)<='z')
				{
					c1[j++]=s.charAt(i);
				}
				
				else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					c2[k++]=s.charAt(i);
				}
			}
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			int p=0,q=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='a' && s.charAt(i)<='z')
				{
					c5[i]=c1[p++];
				}
				
				else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					c5[i]=c2[q++];
				}
			}
					
			String s2=new String(c5);//How to convert char[] to String
			
			return s2;
		}
		
		return "";
	}

}
