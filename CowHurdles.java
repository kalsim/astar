import java.util.Scanner;

public class CowHurdles {
	private static int n;
	private static int m;
	private static int t;
	private static int[][] dist;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		dist = new int[n+1][n+1];
		
		for (int i=1; i<dist.length; i++)
		{
			for (int j=1; j<dist[0].length; j++)
				dist[i][j] = -1;
		}
		
		for (int i=0; i<m; i++)
		{
			dist[sc.nextInt()][sc.nextInt()] = sc.nextInt();
		}
		
		
		for (int k=1; k<n+1; k++)
		{
			for (int i=1; i<n+1; i++)
			{
				for (int j=1; j<n+1; j++)
				{
					if (dist[i][k]!=-1 && dist[k][j]!= -1 && dist[i][j]!=-1)
						if (Math.max(dist[i][k], dist[k][j])<dist[i][j])
							dist[i][j] = Math.max(dist[i][k], dist[k][j]);
				}
			}
		}
		System.out.println();
		for (int i=1; i<dist.length; i++)
		{
			for (int j=1; j<dist[0].length; j++)
				System.out.print(dist[i][j] + " ");
			System.out.println();
		}
		for (int i = 0; i<t; i++)
		{
			int lol = dist[sc.nextInt()][sc.nextInt()];
			System.out.println(lol);
		}
		sc.close();
	}
}
