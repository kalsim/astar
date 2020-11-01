import java.util.Scanner;

public class CowHopscotch {
//dp[location[i][j]] = # of ways to reach state
	private static int[][] grid;
	private static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		grid = new int[r][c];
		dp = new int[r][c];
		for (int i=0; i<r; i++)
			for (int j=0; j<c; j++)
				grid[i][j] = sc.nextInt();
		dp[0][0] = 1;
		dfs(r-1, c-1);
		System.out.println(dp[r-1][c-1]%1000000007);
		
	}
	public static int dfs(int x, int y)
	{
		if (dp[x][y]!=0)
			return dp[x][y]%1000000007;
		int count = 0;
		for (int i=0; i<x; i++)
		{
			for (int j=0; j<y; j++)
			{
				if (grid[i][j]!=grid[x][y])
				{
					count = count%1000000007;
					count+=dfs(i, j)%1000000007;
				}
			}
		}
		dp[x][y] = count%1000000007;
		return count;
	}
}
