import java.util.HashMap;
import java.util.Scanner;

public class GeeksforGeeks_Number_of_substrings_having_an_equal_number_of_lowercase_and_uppercase_letters 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s = sc.next();
		
		int res = countSubstrings(s);
		
		System.out.println(res);
	}
	
	public static int countSubstrings(String s)
	{
		HashMap<Integer,Integer> h=new HashMap<Integer, Integer>();
		
		int total=0, currsum=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				currsum++;
			
			else
				currsum--;
			
			if(currsum==0)
				total++;
			
			if(h.containsKey(currsum))
				total+=h.get(currsum);
			
			h.put(currsum, h.getOrDefault(currsum, 0)+1);
		}
		
		return total;
	}
}
