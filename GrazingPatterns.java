import java.util.Scanner;

public class GrazingPatterns {
	public static int[][] grass = new int[5][5];
	public static int ans;
	public static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		for (int i=0; i<k; i++)
		{
			grass[sc.nextInt()-1][sc.nextInt()-1]++;
		}
		solve(0, 0, 1);
		System.out.println(ans);
		sc.close();
	}
	public static void solve(int r, int c, int l)
	{
		if (r<0 || r>=5 || c<0 || c>=5)
			return;
		if (grass[r][c] != 0)
			return;
		if (r==4 && c==4)
		{
			if (l==25-k)
				ans++;
			return;
		}
		grass[r][c] = 1;
		solve(r+1, c, l+1);
		solve(r-1, c, l+1);
		solve(r, c-1, l+1);
		solve(r, c+1, l+1);
		grass[r][c]=0;
	}
}
