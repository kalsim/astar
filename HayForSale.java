import java.util.Scanner;

public class HayForSale {
	private static boolean[] dp;
	private static int[] haybales;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		haybales = new int[n];
		dp = new boolean[c+1];
		for (int i=0; i<n; i++)
			haybales[i] = sc.nextInt();
		for (int i=0; i<n; i++)
		{
			for (int j=c; j>0; j--)
			{
				if (haybales[i]==j)
					dp[j] = true;
				else if (haybales[i]<j)
				{
					if (dp[j-haybales[i]])
					{
						dp[j] = true;
					}
				}
			}
		}
//		for(int i=1; i<=c; i++)
//		{
//			for(int j=0; j<n; j++)
//			{
//				if (haybales[j]==i)
//					dp[i] = true;
//				else if (haybales[j]<i)
//				{
//					if (dp[i-haybales[j]])
//					{
//						dp[i] = true;
//					}
//				}
//			}
//		}
		for (int i=c; i>=0; i--)
		{
			if (dp[i])
			{
				System.out.println(i);
				break;
			}
		}
	}
}
