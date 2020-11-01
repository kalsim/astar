/**
dp[index][sum] = # of ways to achieve a sum of "sum" using some subset of
{1... index}
for (i: 1-N)
    for(j: 0 - maxsum)
        dp[i][j] = dp[i-1][j-i] + dp[i-1][j]
*/
import java.util.Scanner;

public class SubsetSums {
	private static int[][] dp;
	private static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		dp = new int[n+1][((n*(n+1))/2)+1];
		dp[0][0] = 1;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=((n*(n+1))/2); j++)
			{
			    if (j>=i)
				    dp[i][j] = dp[i-1][j-i] + dp[i-1][j];
			    //sum ways to get it if you take i or don't take i
				else 
				    dp[i][j] = dp[i-1][j];
			}
		}
		if ((n*(n+1))%4!=0)
		    System.out.println(0);
		else
		    System.out.println(dp[n][(n*(n+1))/4]);
	}
}
