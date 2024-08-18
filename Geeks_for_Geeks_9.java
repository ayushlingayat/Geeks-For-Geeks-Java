//Unit Area of largest region of 1's
//Given a grid of dimension nxm containing 0s and 1s. Find the unit area of the largest region of 1s.
//Region of 1's is a group of 1's connected 8-directionally (horizontally, vertically, diagonally).
// 
//
//Example 1:
//
//Input: grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}}
//Output: 5
//Explanation: The grid is-
//1 1 1 0
//0 0 1 0
//0 0 0 1
//The largest region of 1's is colored
//in orange.
//Example 2:
//
//Input: grid = {{0,1}}
//Output: 1
//Explanation: The grid is-
//0 1
//The largest region of 1's is colored in 
//orange.
//
//Your Task:
//You don't need to read or print anyhting. Your task is to complete the function findMaxArea() which takes grid as input parameter and returns the area of the largest region of 1's.
//
//
//Expected Time Complexity: O(n*m)
//Expected Auxiliary Space: O(n*m)
// 
//
//Constraints:
//1 ≤ n, m ≤ 500

class Solution
{
    int maxlen=0,maxlen2=0;
    //Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int n=grid.length,m=grid[0].length;
        
        maxlen2=0;
        
        boolean [][]vis=new boolean[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1 && !vis[i][j])
                {
                    maxlen=0;
                    dfs(i,j,grid,vis);
                }
            }
        }
        
        return maxlen2;
    }
    
    public void dfs(int i,int j,int [][]grid,boolean [][]vis)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||vis[i][j]||grid[i][j]==0)
        {
            return;
        }
        
        vis[i][j]=true;
        
        maxlen++;
        
        int x[]=new int[]{0,1,1,1,0,-1,-1,-1};
        int y[]=new int[]{1,1,0,-1,-1,-1,0,1};
        
        for(int k=0;k<8;k++)
        {
            dfs(i+x[k],j+y[k],grid,vis);
        }
        
        maxlen2=Math.max(maxlen2,maxlen);
        
    }
}