
public class Geels_for_Geeks_3 
{
	public static void main(String[] args)
	{
		int p[][]= {{5,24},{39,60},{15,28},{27,40},{50,90}};
		
//		System.out.println(p.length);
//		System.out.println(p[0].length);
		
		int count=0;
		
		for(int i=0;i<p.length-1;i++)
		{
			for(int j=1;j<p[i].length;j++)
			{
				if(p[i][j]<p[i+1][j-1])
				{
					System.out.println(p[i][j]+" "+p[i+1][j-1]);
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
