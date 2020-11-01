import java.util.Scanner;

public class HoofPaperScissors {
	private static int[][][] dp;
	private static int n;
	private static int k;
	private static String[] moves;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * dp[games][swaps][current] = max # of wins in 1-games if we've made "swaps" swaps
		 * dp[i][j][k] = max of (dp[i-1][j][k] - same, dp[i-1][j-1][(k+1)%3], d[i-1][j-1][(k+2)%3])
		 * +1 for a win
		 */
		n = sc.nextInt();
		k = sc.nextInt();
		sc.nextLine();
		moves = new String[n];
		for (int i=0; i<n; i++)
		{
			moves[i] = sc.nextLine();
		}
		
		/**
		 * dp[n][k][3]
		 * dp[i][j][k] is max score up to i with j changes and ending at value k
		 */
		for (int i=0; i<dp[i].length; i++)
		{
			for (int j=0; j<dp[j].length; j++)
			{
				for (int x=0; x<3; x++)
				{
					dp[i][j][k] = Math.max(dp[i-1][j][k] - same, dp[i-1][j-1][(k+1)%3], d[i-1][j-1][(k+2)%3])
				} 
			}
		}
		
	}
}
