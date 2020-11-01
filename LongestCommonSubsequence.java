import java.util.Scanner;

public class LongestCommonSubsequence {
	private static String s1;
	private static String s2;
	private static int[] dp;
	private static int[] dp2;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		dp = new int[s2.length()+1];
		dp2 = new int[s2.length()+1];
		for (int i=1; i<s1.length()+1;i++)
		{
			for (int j=1; j<s2.length()+1; j++)
			{
				if (s1.charAt(i-1)==s2.charAt(j-1))
					dp2[j] = dp[j-1]+1;
				else
					dp2[j] = Math.max(dp[j], dp2[j-1]);
			}
			for (int x=0; x<dp.length; x++)
				dp[x] = dp2[x];
		}
		System.out.println(dp[dp.length-1]);
		//dp[i][j] = LCS between s1[1-i] and s2[1-j]
		/**
		 * if (s1[i] == s2[j])
		 * 	dp[i][j] = dp[i-1][j-1]+1;
		 * else
		 * 	dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
		 */
	}
}
