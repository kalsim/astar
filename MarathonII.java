import java.util.Scanner;

public class MarathonII {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[]x = new int[len];
		int[]y = new int[len];
		for (int i=0; i<len; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		int best = total(x, y);
		for (int k=1; k<x.length-1; k++)
		{
			best = Math.min(best, total - dist from point before to k and k to point after + distance from point before to point after k)
		}
		System.out.println(best);
	}
	public static int total(int[] x, int[] y)
	{
		int total = 0;
		for (int i=1; i<x.length; i++)
		{
			total+=dist(x[i], y[i], x[i-1], y[i-1]);
		}
		return total;
	}
	public static int dist(int x1, int y1, int x2, int y2)
	{
		return Math.abs(x1-x2) + Math.abs(y1-y2);
	}
}
