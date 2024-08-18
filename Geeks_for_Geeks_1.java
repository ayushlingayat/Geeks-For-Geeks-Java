//Two players X and Y are playing a game in which there are pots of gold arranged in a line, each containing some gold coins. They get alternating turns in 
//which the player can pick a pot from one of the ends of the line. The winner is the player who has a higher number of coins at the end. 
//The objective is to maximize the number of coins collected by X, assuming Y also plays optimally.
//Return the maximum coins X could get while playing the game. Initially, X starts the game.

//Input:
//N = 4
//Q[] = {8, 15, 3, 7}
//Output: 22
//Explanation: Player X starts and picks 7. Player Y 
//picks the pot containing 8. Player X picks the pot
//containing 15. Player Y picks 3.
//Total coins collected by X = 7 + 15 = 22.


public class Geeks_for_Geeks_1
{
	public static void main(String[] args)
	{
		int q[]= {8,15,3,7};
		
		System.out.println("Coins recieved by X: "+maxCoins(q.length,q));
	}
	
	public static int maxCoins(int N,int A[])
	{
		int q2[][]=new int[N][N];
		
		for(int i=0;i<q2.length;i++)
		{
			for(int j=0;j<q2.length;j++)
			{
				q2[i][j]=-1;
			}
		}
		
		return add(A,N,0,N-1,q2);
	}
		
	public static int add(int A[],int n,int l,int h,int q2[][])
	{
		if(l==h)
		{
			return q2[l][h]=A[l];
		}
		
		if(l+1==h) 
		{
			return q2[l][h]=Math.max(A[l],A[h]);
		}
		
		if(q2[l][h]!=-1)
		{
			return q2[l][h];
		}
		
		return q2[l][h]=Math.max(A[l]+Math.min(add(A,n,l+2,h,q2),add(A,n,l+1,h-1,q2)),A[h]+Math.min(add(A,n,l+1,h-1,q2),add(A,n,l,h-2,q2)));
	}

}
