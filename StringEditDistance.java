import java.util.Scanner;

public class StringEditDistance {
/**
 * dp[i][j] = min edit distance between s1[1 to i] and s2[1 to j]
 * if (s1[i]=s2[j]
 * 	dp[i-1][j-1]
 * else
 * 	Math.min(dp[i-1][j]+1 delete case, dp[i][j-1]+1 insert case, dp[i-1][j-1]+1 replace case);
 */
	//Base case isn't all 0s
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
					dp[i][j] = dp[i-1][j-1];
				else
				{
					int x = Math.min(dp[i][j-1]+1, dp[i-1][j]+1);
					dp[i][j] = Math.min(x, dp[i-1][j-1]+1);
				}
			}
		}
		System.out.println(dp[s1.length()][s2.length()]);
	}
/**
 * Base case: f(0, x) = x, f(y, 0) = y

	f(y, x) = min{ f(y-1, x-1) + {0 if s1[y] = s2[x], - same characters, no action
	1 otherwise}                                          - replace s1[y] => s2[x]
	f(y, x-1) + 1                                            - insert s2[x] to s1 at y
	f(y-1, x) + 1 }                                          - delete s1[y]

Answer: f(n, m)
 */
}
