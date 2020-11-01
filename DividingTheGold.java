/**
 * dp[index][sum] = # of ways to use coins 1 to index to achieve sum
 * 
 * take sum Vi / 2
 */ 
 import java.util.Scanner;

public class DividingTheGold {
	private static int[] coins;
	private static int[] dp1;
	private static int[] dp2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coins =  new int[n+1];
		for (int i=1; i<=n; i++)
			coins[i] = sc.nextInt();
		int max = 0;
		for (int x: coins)
			max+=x;
		dp1 = new int[max+1];
		dp2 = new int[max+1];
		dp1[0] = 1;
		dp1[coins[1]] = 1;
		for (int i=2; i<=n; i++)
		{
			for (int j=0; j<=max; j++)
			{
			    if (j-coins[i]>=0)
				    dp2[j] = dp1[j-coins[i]] + dp1[j];
			    else
				    dp2[j] =  dp1[j];
			}
			
			for (int x=0; x<dp1.length; x++)
				dp1[x] = dp2[x];
		}
		int b = max/2;
		int c = max/2;
		if (max%2==1) c++;
		for (int i=0; i<max/2;i++)
		{
			if (dp2[b-i]>0)
			{
				System.out.println(2*i+c-b);
				System.out.println(dp2[b-i]);
				break;
			}
		}
	}
}
