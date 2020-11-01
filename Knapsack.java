/**
 * dp[index][capacity] = max value u can get if u use objects 1-index
 * with capacity <= "capacity"
 * for (i: 1-N)
 *  for (j: 1-cap_max)
 *      if (Si<=j)
 *          dp[i][j] = dp[i-1][j-Si] + Vi;
 *      dp[i][j] = max(dp[i][j], dp[i-1][j])
 */ 
 import java.util.Scanner;

public class Knapsack {
	private static int[][] knapsack;
	private static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		knapsack = new int[n+1][3];
		dp = new int[n+1][c+1];
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=2; j++)
				knapsack[i][j] = sc.nextInt();
		}
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=c; j++)
			{
				if (knapsack[i][1]<=j)
				{
					dp[i][j] = dp[i-1][j-knapsack[i][1]] + knapsack[i][2];
				}
				dp[i][j] = Math.max(dp[i][j], dp[i-1][j]);
			}
		}
		System.out.println(dp[n][c]);
	}
}
