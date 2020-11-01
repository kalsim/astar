import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MilkingTime {
	private static int[] dp;
	private static int[][] milk;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		dp = new int[m];
		milk = new int[m][3];
		for (int i=0; i<m; i++)
		{
			for (int j=0; j<3; j++)
			{
				milk[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(milk, new Comparator<int[]>()
		{
			public int compare(int[] o1, int[] o2)
			{
				return o1[1]-o2[1];
			}
		});
		dp[0] = milk[0][2];
		for (int i=1; i<m; i++)
		{
			int max =0;
			for (int j=i-1; j>=0; j--)
			{
				if (milk[j][1]+r<=milk[i][0])
					max = Math.max(dp[j], max);
			}
			max+=milk[i][2];
			max = Math.max(max, dp[i-1]);
			dp[i] = max;
		}
		System.out.println(dp[m-1]);
	}
}
