import java.io.*;
import java.util.*;

public class GFG_Missing_number_in_array
{
 	public static void main(String[] args) throws IOException 
 	{
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		int t = Integer.parseInt(br.readLine().trim());
 
 		while (t-- > 0) {
 			int n = Integer.parseInt(br.readLine().trim());
 			String[] str = br.readLine().trim().split(" ");
 			int[] array = new int[n - 1];
 			
 			for (int i = 0; i < n - 1; i++) {
 				array[i] = Integer.parseInt(str[i]);
 			}
 
 			Solution1 sln = new Solution1();
 			System.out.println(sln.missingNumber(array, n));
 		}
 	}
}

class Solution1 {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum= (n*(n+1))/2;
        
        int y=0;
        
        for(int i:array)
        {
            y+=i;
        }
        
        return sum-y;
    }
}