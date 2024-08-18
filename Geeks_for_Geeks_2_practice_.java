import java.util.Arrays;

public class Geeks_for_Geeks_2_practice_
{
	public static void main(String[] args) 
	{
		String s="srbDKi";
		
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
		
//		char c3[]=new char[s.length()];
//		char c4[]=new char[s.length()];
		
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
		
//		for(char y:c1)
//		{
//			System.out.print(y);
//		}
//		
//		System.out.println();
//		
//		for(char z:c2)
//		{
//			System.out.print(z);
//		}
//		
//		System.out.println();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
//		for(int i=0;i<c1.length;i++)
//		{
//			if(c1[i]!=' ')
//			{
//				c3[l++]=c1[i];
//			}
//		}
//		
//		for(int i=0;i<c2.length;i++)
//		{
//			if(c2[i]!=' ')
//			{
//				c4[m++]=c2[i];
//			}
//		}
//		
//		for(char a:c3)
//		{
//			System.out.print(a);
//		}
//		System.out.println();
//		
//		for(char b:c4)
//		{
//			System.out.print(b);
//		}
//		System.out.println();
		
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
		
		for(char t:c5)
		{
			System.out.print(t);
		}

	}

}
