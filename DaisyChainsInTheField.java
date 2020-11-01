import java.util.Scanner;

public class DaisyChainsInTheField {
	private static int n;
	private static int m;
	private static int[] visited;
	private static int[][] adj;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
	    adj = new int[n][n];
		for (int i=0; i<m; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			adj[x-1][y-1] = 1;
			adj[y-1][x-1] = 1;
		}
//		for (int i=0; i<adj.length; i++)
//		{
//			for (int j=0; j<adj[0].length; j++)
//				System.out.print(adj[i][j] + " ");
//			System.out.println();
//		}
//		System.out.println();
		visited = new int[n];
		dfs(0);
		boolean URMOM = false;
		for (int a = 0; a<visited.length; a++)
		{
			if (visited[a]==0)
			{
				System.out.println(a+1);
				URMOM = true;
			}
		} 
		if (!URMOM)
			System.out.println(0);
		sc.close();
	}
	public static void dfs(int u)
	{
//		System.out.print(u + ": ");
//		for(int i=0; i<visited.length;i++)
//			System.out.print(visited[i] + " ");
//		System.out.println();
		visited[u]=1;
		for (int j = 0; j<n; j++)
		{
			if (adj[u][j]>0)
			{
				if(visited[j]==0)
				{
					dfs(j);
				}
			}
		}
	}
}
