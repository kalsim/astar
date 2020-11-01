import java.util.Scanner;

public class Bookshelf2 {
	public static int best;
	public static int len;
	public static int h;
	public static int[] heights;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		h = sc.nextInt();
		best = 1000000000;
		heights = new int[len];
		for (int i=0; i<len; i++)
		{
			heights[i] = sc.nextInt();
		}
		f(0, 0);
		System.out.println(best);
	}
	public static void f(int x, int sum)
	{
		if (sum>=h && best>sum-h)
		{
			best = sum-h;
			return;
		}
		if (x==len)
		{
			if (sum>=h && best>sum-h)
			{
				best = sum-h;
				return;
			}
		}
		else
		{
			f(x+1, sum);
			f(x+1, sum+heights[x]);
		}
	}
}
