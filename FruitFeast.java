import java.util.Scanner;

public class FruitFeast {
	private static boolean[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		dp = new boolean[t+1][2];
		dp[0][0] = true;
		
		for (int j=0; j<2; j++)
		{
			for (int i=0; i<=t; i++)
			{
				if (dp[i][j])
				{
					if (i+a<=t)
						dp[i+a][j] = true;
					if (i+b<=t)
						dp[i+b][j] = true;
					if (j==0)
						dp[i/2][1] = true;
				}
			}
		}
		for (int j=t; j>=0; j--)
		{
			for (int i=0; i<2; i++)
			{
				if (dp[j][i])
				{
					System.out.println(j);
					System.exit(1);
				}
			}
		}
	}
}
