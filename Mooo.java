import java.awt.Point;
import java.util.Scanner;
import java.util.Stack;
public class Mooo {
	private static int[] lol;
	private static Point[] points;
	private static Stack<Point> stacc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		lol = new int[len];
		points = new Point[len];
		for (int i=0; i<len; i++)
		{
			Point p = new Point(sc.nextInt(), sc.nextInt());
			points[i] = p;
		}
		
		
		stacc = new Stack<Point>();
	
		for (int i=0; i<points.length; i++)
		{
			while (!stacc.isEmpty() && points[i].getX()>=stacc.peek().getX())
			{
				lol[i]+=stacc.peek().getY();
				stacc.pop();
			}
			stacc.push(points[i]);
		}
		
		while (!stacc.isEmpty())
			stacc.pop();
		
		for (int i=points.length-1; i>=0; i--)
		{
			while (!stacc.isEmpty() && points[i].getX()>=stacc.peek().getX())
			{
				lol[i]+=stacc.peek().getY();
				stacc.pop();
			}
			stacc.push(points[i]);
		}
		
		int max = 0;
		
		for (int x: lol)
			max = Math.max(max, x);
		
		System.out.println(max);
		sc.close();
	}
	
}
