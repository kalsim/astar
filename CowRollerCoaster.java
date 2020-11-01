import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CowRollerCoaster {
	private static int L;
	private static int N;
	private static int B;
	private static int[][] dp;
	private static int[][] parts;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		L = sc.nextInt();
		N = sc.nextInt();
		B = sc.nextInt();
		dp = new int[L+1][B+1];
		parts = new int[N][4];
		for (int i=0; i<N; i++)
			for (int j=0; j<4; j++)
				parts[i][j] = sc.nextInt();
		Arrays.sort(parts, new Comparator<int[]>() {
		    @Override
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(b[0], a[0]);
		    }
		});

		//go through dp and figure stuff out
		for (int i=0; i<=L; i++)
		{
			for (int j=0; j<=B; j++)
			{
				for (int x=0; x<N; x++)
				{
					if (parts[x][0]==i && j+parts[x][3]<=B)
					{
						dp[i+parts[x][1]][j+parts[x][3]] = Math.max(dp[i+parts[x][1]][j+parts[x][3]], dp[i][j]+parts[x][2]);
					}
				}
			}
		}
		
		for(int i=0; i < N; i++)
			for (int j=0; j<B; j++)
				dp[i-1][j] = Math.max(L, B-L);
		
		int max = 0;
		for (int j=0; j<=B; j++)
			max = Math.max(max, dp[L][j]);
		if (max==0)
			max = -1;
		System.out.println(max);
	}
}
