import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pathfinding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] lol = new int[n][n];
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				lol[i][j] = sc.nextInt();
			}
		}
		Queue<Integer> q = new LinkedList<Integer>();
		int[] distance = new int[n]; 
		q.add(m);
		distance[m-1] = 1;
		while (!q.isEmpty())
		{
			int x = q.remove();
			for (int y = 0; y<n; y++)
			{
				if (lol[x-1][y] == 1 && distance[y]==0)
				{
					q.add(y+1);
					distance[y] = distance[x-1]+1;
				}
			}
		}
		for (int a = 1; a<=distance.length; a++)
		{
			for (int b = 0; b<distance.length; b++)
			{
				if (distance[b]==a)
					System.out.print(b+1 + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
