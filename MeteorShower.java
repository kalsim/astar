import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MeteorShower {

	public static int M;
	public static int[][] urmom;
	public static int distance;
	public static int[][] marked;
	public static Queue<Point> q;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		urmom = new int[303][303];
		marked = new int[303][303];
		for (int i=0; i<303; i++)
			for (int j=0; j<303; j++)
				urmom[i][j]=Integer.MAX_VALUE;

		q = new LinkedList<Point>();
		distance = 0;
		for (int i=0; i<M; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int t = sc.nextInt();
			urmom[x][y] = Math.min(urmom[x][y], t);
			if (x+1<303)
				urmom[x+1][y] = Math.min(urmom[x+1][y], t);
			if (y+1<303)
				urmom[x][y+1] = Math.min(urmom[x][y+1], t);
			if (x-1>=0)
				urmom[x-1][y] = Math.min(urmom[x-1][y], t);
			if (y-1>=0)
				urmom[x][y-1] = Math.min(urmom[x][y-1], t);
		}

		q.add(new Point (0, 0));
		marked[0][0]++;
		while (!q.isEmpty())
		{
			distance++;
			int size = q.size();
			for (int i=0; i<size; i++)
			{
				Point p = q.poll();
				if (urmom[p.x][p.y]==Integer.MAX_VALUE)
				{
					System.out.println(distance-1);
					System.exit(0);
				}
				else
				{
					if (p.x+1<303 && marked[p.x+1][p.y]==0 && distance<urmom[p.x+1][p.y])
					{
						marked[p.x+1][p.y]++;
						q.add(new Point(p.x+1, p.y));
					}
					if (p.x-1>=0 && marked[p.x-1][p.y]==0 && distance<urmom[p.x-1][p.y])
					{
						marked[p.x-1][p.y]++;
						q.add(new Point(p.x-1, p.y));
					}
					if (p.y+1<303 && marked[p.x][p.y+1]==0 && distance<urmom[p.x][p.y+1])
					{
						marked[p.x][p.y+1]++;
						q.add(new Point(p.x, p.y+1));
					}
					if (p.y-1>=0 && marked[p.x][p.y-1]==0 && distance<urmom[p.x][p.y-1])
					{
						marked[p.x][p.y-1]++;
						q.add(new Point(p.x, p.y-1));
					}
				}
			}
		}
		System.out.println(-1);
	}
}
