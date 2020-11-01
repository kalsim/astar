import java.util.Scanner;

public class CowPieTreasures {
	private static int[][] a;
	private static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = new int[n][m];
		dp = new int[n][m];
		for (int i = 0; i<n; i++)
		{
			for (int j=0; j<m; j++)
			{
				a[i][j] = sc.nextInt();
				if (j<i)
					dp[i][j]=-1;
			}
		}
		dp[0][0] = a[0][0];
		for (int c=1; c<m; c++)
		{
			for (int r=0; r<n; r++)
			{
				if (dp[r][c]!=-1)
				{
					int m1 = 0;
					int m2 = 0;
					int m3 = 0;
					if (r-1>=0)
						m1 = dp[r-1][c-1];
					if (r+1<n)
						m2 = dp[r+1][c-1];
					m3 = dp[r][c-1];
					int max = Math.max(m1, m2);
					max = Math.max(max,  m3);
					dp[r][c] = a[r][c] + max;
				}
			}
		}
		System.out.println(dp[n-1][m-1]);
	}
}
