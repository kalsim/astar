import java.util.Scanner;

public class EatingTogether {
	private static int[] a;
	private static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n];
		dp = new int[n][3]; // dp(pos)(num) -> # of changes to sort 1-pos
		for (int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		dp[0][0] = 1;
		dp[0][1] = 1;
		dp[0][2] = 1;
	    dp[0][a[0]-1]=0;
		for (int i=1; i<n; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (a[i]==1)
					dp[i][0] = dp[i-1][0]+1;
				if (a[i]==2)
					dp[i][1] = Math.min(dp[i-1][0],dp[i-1][1])+1;
				if (a[i]==3)
					dp[i][2] = Math.min(Math.min(dp[i-1][0],dp[i-1][1]),dp[i-1][2])+1;
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i=0; i<3; i++)
			min = Math.min(min, dp[n-1][i]);
		System.out.println(min);
	}
}

