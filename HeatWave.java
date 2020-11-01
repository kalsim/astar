import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HeatWave {
	private static int t;
	private static int c;
	private static int start;
	private static int end;
	private static int[] distance;
	private static int[][] weight;
	private static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		c = sc.nextInt();
		start = sc.nextInt();
		end = sc.nextInt();
		distance = new int[t+1];
		visited = new boolean[t+1];
		weight = new int[t+1][t+1];
		for (int i=0; i<c; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			weight[a][b] = c;
			weight[b][a] = c;
		}
		dijkstra(start);
		System.out.println(distance[end]);
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
			for (int z=1; z<t+1; z++)
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
//	public static int end;
//	public static int[][] paths;
//	public static int cost;
//	public static int size;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int towns = sc.nextInt();
//		boolean[] used = new boolean[towns];
//		for (int x=0; x<towns; x++)
//			used[x] = false;
//		size = sc.nextInt();
//		int start = sc.nextInt();
//		end = sc.nextInt();
//		cost = Integer.MAX_VALUE;
//		paths = new int[size][3];
//		for (int i=0; i<size; i++)
//		{
//			for (int j=0; j<3; j++)
//			{
//				paths[i][j] = sc.nextInt();
//			}
//		}
//		//Set<Integer> set = new HashSet<Integer>();
//		findPath(start, 0, used);
//		System.out.println(cost);
//		sc.close();
//	}
//	public static void findPath(int curpos, int c, boolean[] b)
//	{
//		if (curpos == end)
//		{
//			if (c<cost)
//				cost = c;
//			return;
//		}
//		if (b[curpos-1]==true)
//			return;
//		b[curpos-1]=true;
//		for (int i=0; i<size; i++)
//		{
//			if (paths[i][0] == curpos)
//			{
//				findPath(paths[i][1], c+paths[i][2], b);
//			}
//			else if (paths[i][1] == curpos)
//			{
//				findPath(paths[i][0], c+paths[i][2], b);
//			}
//		}
//		b[curpos-1]=false;
//	}
//	// try sorting the 2d array based on where each town can go
//
