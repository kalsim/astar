import java.util.Scanner;

public class Roadblocks {
	private static int n;
	private static int r;
	private static int s;
	private static int[] distance;
	private static int[][] weight;
	private static boolean[] visited;
	private static int minUpdate;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		s = 1;
		minUpdate = Integer.MAX_VALUE;
		distance = new int[n+1];
		visited = new boolean[n+1];
		visited[0] = true;
		for (int i=1; i<n+1; i++)
			visited[i] = false;
		weight = new int[n+1][n+1];
		for (int i=0; i<r; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			weight[a][b] = c;
			weight[b][a] = c;
		}
		dijkstra(s);
		System.out.println(distance[distance.length-1]+3*minUpdate);
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
			for (int z=1; z<n+1; z++)
			{
				if (weight[minIndex][z] > 0)
				{
					int temp = Math.abs(distance[z] - (distance[minIndex] + weight[minIndex][z]));
					if (temp!=0)
						minUpdate = Math.min(minUpdate, temp);
					distance[z] = Math.min(distance[z], distance[minIndex] + weight[minIndex][z]);
				}
			}
			visited[minIndex] = true;
		}
	}
}
