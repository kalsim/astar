import java.util.Scanner;

public class BookClub {
	private static int r;
	private static int c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int p = sc.nextInt();
		int[][] lol = new int[r][c];
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
			{
				lol[i][j] = sc.nextInt();
			}
		}
		boolean[] mark = new boolean[r];
		for (int i=0; i<r; i++)
			mark[i] = true;
		int ans = 0;
		for (int i=0; i<p; i++)
		{
			int q = sc.nextInt();
			int a = sc.nextInt();
			for (int j=0; j<r; j++)
			{
				if (lol[j][q-1] != a)
					mark[j] = false;
			}
		}
		for (int i=0; i<r; i++)
		{
			if (mark[i] == true)
				ans++;
		}
		System.out.println(ans);
	}
}
