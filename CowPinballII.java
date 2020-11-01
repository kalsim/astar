import java.util.Scanner;

public class CowPinballII {
	private static int[][] a;
	private static int[][] lis;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new int[n][n];
		lis = new int[n][n];
		for (int i=0; i<n; i++)
		{
			int j=i+1;
			for (int x=0; x<j; x++)
			{
				a[i][x] = sc.nextInt();
			}
		}
		for (int i=0; i<n; i++)
		{
			int j=i+1;
			for (int x=0; x<j; x++)
			{
				int a1 = 0;
				int b1 = 0;
				if (i-1>=0)
				{
					a1 = lis[i-1][x];
					if (x-1>=0)
						b1 = lis[i-1][x-1];
				}
				lis[i][x] = a[i][x]+Math.max(a1, b1);
			}
		}
		int max = 0;
		for (int z=0; z<n; z++)
		{
			max = Math.max(max, lis[n-1][z]);
		}
		System.out.println(max);
		/**for (int j=0; j<n; j++)
		{
			lis[j][0] = sc.nextInt();
		}*/
		/**
		 * use matching lis array to find max path at each value
		 * traverse thru the a array and calculate max path values in lis
		 * score[i+1][j] = Math.max(score[i+1][j], score[i][j] + value[i+1][j])
		 */
	}
	/**
	private static int f()
	{
		  for (int i = n-1; i >= 0; i--)	// rows from bottom to top
		    for (int j = 0; j <= i; j++)	//   columns from left to right
		      mat[i][j] = mat[i][j] + max(mat[i+1][j], mat[i+1][j+1]);
		  return mat[0][0];
		}*/
}
