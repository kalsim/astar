import java.util.Scanner;

public class AvoidTheLakesRecursion {
	private static int[][] lol;
	private static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		lol = new int[sc.nextInt()][sc.nextInt()];
		int x = sc.nextInt();
		max = 0;
		for (int i=0; i<lol.length; i++)
		{
			for (int j=0; j<lol[0].length; j++)
			{
				lol[i][j] = 0;
			}
		}
		for (int i=0; i<x; i++)
		{
			lol[sc.nextInt()-1][sc.nextInt()-1] = 1;
		}
		for (int i=0; i<lol.length; i++)
		{
			for (int j=0; j<lol[0].length; j++)
			{
				if (lol[i][j] == 1);
				{
					max = Math.max(max, ff(i, j, 2));
				}
			}
		}
		System.out.println(max);
		sc.close();
	}
	public static int ff(int r, int c, int k)
	{
		if (r<0 || r>=lol.length || c<0 || c>=lol[0].length)
			return 0;
		//if at r c it equals k return
		if (lol[r][c]!= 1)
			return 0;
		lol[r][c] = k;
		return ff(r-1, c, k)+ff(r+1, c, k)+ff(r, c-1, k)+ff(r, c+1, k)+1;
	}
}
