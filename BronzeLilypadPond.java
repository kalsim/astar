import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BronzeLilypadPond {
	public static int[][] pond;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		pond = new int[m][n];
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		Point start = null;
		Point end;
		for (int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				pond[i][j] = sc.nextInt();
				if (pond[i][j]==3)
					start = new Point(i, j);
				if (pond[i][j]==4)
					end = new Point(i, j);
			}
		}
		Queue<Point> q = new LinkedList<Point>();
		q.add(start);
		while (!q.isEmpty())
			// end when u reach end and output
	}
	public static boolean isValid(Point p, int m1, int m2)
	{
		return (p.getX()+m1>=0 && p.getX()+m1<pond.length) && 
				(p.getY()+m2>=0 && p.getY()+m2<pond[0].length) && 
				pond[(int)p.getX()+m1][(int)p.getY()+m2]==1;
	}
}
