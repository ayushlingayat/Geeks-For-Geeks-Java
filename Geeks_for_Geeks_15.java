
public class Geeks_for_Geeks_15 
{
	public static void main(String[] args) 
	{
		int a[]= {4,8,7,5,1};
		
		int b[]= {4,48,3,0,1,1,5};
		
		int t[]=out(a,b,a.length,b.length);
		
		for(int i:t)
		{
			System.out.print(i+" ");
		}
	}
	
	public static int[] out(int a[],int b[],int m,int n)
	{
		int c[]=new int[m];
		
		int count=0;
		
		for(int i=0;i<m;i++)
		{
			count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]>=b[j])
				{
					count++;
				}				
			}
			c[i]=count;
		}
		
		return c;
	}

}
