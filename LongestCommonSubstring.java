import java.util.Scanner;

public class LongestCommonSubstring {
	private static String s1;
	private static String s2;
	private static int[][] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		dp = new int[s1.length()+1][s2.length()+1];
		for (int i=1; i<s1.length()+1;i++)
		{
			for (int j=1; j<s2.length()+1; j++)
			{
				if (s1.charAt(i-1)==s2.charAt(j-1))
					dp[i][j] = dp[i-1][j-1]+1;
			}
		}
		int max = 0;
		for (int i=1; i<s1.length()+1;i++)
		{
			for (int j=1; j<s2.length()+1; j++)
			{
				max = Math.max(dp[i][j], max);
			}
		}
		System.out.println(max);
		//dp[i][j] = LCS between s1[1-i] and s2[1-j]
		/**
		 * if (s1[i] == s2[j])
		 * 	dp[i][j] = dp[i-1][j-1]+1;
		 * else
		 * 	dp[i][j] = 0; needs to be contiguous
		 */
	}
}
