
import java.io.*;
import java.util.*;

public class GFG_Kadanes_Algorithm 
{
	public static void main (String[] args) throws IOException 
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
 
		 while(t-->0)
		 {
			 //size of array
			 int n = Integer.parseInt(br.readLine().trim());
			 int arr[] = new int[n];
			 String inputLine[] = br.readLine().trim().split(" ");

			 //adding elements
			 for(int i=0; i<n; i++)
			 {
				 arr[i] = Integer.parseInt(inputLine[i]);
			 }

			 Solution3 obj = new Solution3();
			 
			//calling maxSubarraySum() function
			 System.out.println(obj.maxSubarraySum(arr, n));
		 }
	 }
}

class Solution3{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
        long currsum=0;
        long maxsum= Long.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            currsum=currsum+arr[i];
            
            if(maxsum<currsum)
            {
                maxsum=currsum;
            }
            
            if(currsum<0)
            {
                currsum=0;
            }
        }
        
        return maxsum;
    }
}
