import java.util.Scanner;

public class DijkstrasShortestPath {
	private static int v;
	private static int e;
	private static int s;
	private static int[] distance;
	private static int[][] weight;
	private static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		e = sc.nextInt();
		s = sc.nextInt();
		distance = new int[v+1];
		visited = new boolean[v+1];
		visited[0] = true;
		for (int i=1; i<v+1; i++)
			visited[i] = false;
		weight = new int[v+1][v+1];
		for (int i=0; i<e; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			weight[a][b] = c;
			weight[b][a] = c;
		}
		dijkstra(s);
		for (int i=1; i<distance.length; i++)
		{
			if (distance[i] == Integer.MAX_VALUE)
				System.out.println(-1);
			else
				System.out.println(distance[i]);
		}
		sc.close();
	}
	public static void dijkstra(int u)
	{
		for (int i=1; i<distance.length; i++)
		{
			if (i==u)
				distance[i] = 0;
			else
				distance[i] = Integer.MAX_VALUE;
		}
		
		for (int j=1; j<distance.length; j++)
		{
			int min = Integer.MAX_VALUE;
			int minIndex = 0;
			for (int x=1; x<distance.length; x++)
			{
				if (distance[x]<min && !visited[x])
				{
					min = distance[x];
					minIndex = x;
				}
			}
			for (int z=1; z<v+1; z++)
			{
				if (weight[minIndex][z] > 0)
				{
					distance[z] = Math.min(distance[z], distance[minIndex] + weight[minIndex][z]);
					
				}
			}
			visited[minIndex] = true;
		}
	}
}