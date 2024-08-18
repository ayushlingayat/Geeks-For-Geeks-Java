import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG_Subarray_with_given_sum 
{
	static BufferedReader br;
	static PrintWriter ot;
	
	public static void main(String[] args) throws IOException
	{
		 br = new BufferedReader(new InputStreamReader(System.in));
		 ot = new PrintWriter(System.out);
		 int t = Integer.parseInt(br.readLine());
		 
		 while(t-->0)
		 {
			 String s[] = br.readLine().trim().split(" ");

			 int n = Integer.parseInt(s[0]);
			 int k = Integer.parseInt(s[1]);
			 int a[] = new int[n];
			 s = br.readLine().trim().split(" ");
			 
			 for(int i = 0; i < n; i++)
				 a[i] = Integer.parseInt(s[i]);
			 
			 Solution obj = new Solution();
			 
			 ArrayList<Integer> res = obj.subarraySum(a, n, k);
			 
			 for(int ii = 0;ii<res.size();ii++)
				 ot.print(res.get(ii) + " ");
			 
			 ot.println();
		 }
		 
		 ot.close();
	}
}

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int l=0,r=0,m=arr[0];
        
        ArrayList<Integer> l1=new ArrayList<Integer>();
        boolean isF= false;
        
        if(s==0)
        {
            l1.add(-1);
            return l1;
        }
        
        while(r<n)
        {
            if(m==s)
            {
                isF=true;
                break;
            }
            
            else if(m<s)
            {
                r++;
                
                if(r<n)
                {
                    m+=arr[r];
                }
            }
            
            else
            {
                m-=arr[l];
                l++;
            }
        }
        
        if(isF)
        {
            l1.add(l+1);
            l1.add(r+1);
            
            return l1;
        }
        
        l1.add(-1);
        return l1;
    }
}
