//Generate IP Addresses
//EasyAccuracy: 43.42%Submissions: 20427Points: 2
//Lamp
//This problem is part of GFG SDE Sheet. Click here to view more.  
//
//Given a string S containing only digits, Your task is to complete the function genIp() which returns a vector containing all possible combinations of valid IPv4 IP addresses and takes only a string S as its only argument.
//Note: Order doesn't matter.
//
//For string 11211 the IP address possible are 
//1.1.2.11
//1.1.21.1
//1.12.1.1
//11.2.1.1
//
//Example 1:
//
//Input:
//S = 1111
//Output: 1.1.1.1
//Example 2:
//
//Input:
//S = 55
//Output: -1
//
//Your Task:
//
//Your task is to complete the function genIp() which returns a vector containing all possible combinations of valid IPv4 IP addresses or -1 if no such IP address could be generated through the input string S, the only argument to the function.
//
//Expected Time Complexity: O(N * N * N * N)
//Expected Auxiliary Space: O(N * N * N * N)
//
//Constraints:
//1<=N<=16
//here, N = length of S.
//S only contains digits(i.e. 0-9)

import java.util.ArrayList;

class Solution {
    ArrayList<String> list;
    
    public ArrayList<String> genIp(String s) {
        // code here
        
        list=new ArrayList<String>();
        int n=s.length();
        
        if(n<4)
        {
            list.add("-1");
            return list;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    String s1=s.substring(0,i);
                    String s2=s.substring(i,j);
                    String s3=s.substring(j,k);
                    String s4=s.substring(k);
                    
                    if(isval(s1)&&isval(s2)&&isval(s3)&&isval(s4))
                    {
                        list.add(s1+"."+s2+"."+s3+"."+s4);
                    }
                }
            }
        }
        
        if(list.size()==0)
        {
            list.add("-1");
            return list;
        }
        
        return list;
    }
    
    public boolean isval(String s)
    {
        if(s.length()==0 || s.length()>3)
        {
            return false;
        }
        
        int n=Integer.valueOf(s);
        
        if(s.length()>1 && s.charAt(0)=='0')
        {
            return false;
        }
        
        return n<=255;
    }
    
    
}