import java.awt.Point;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TallestCow {
	private static int[] heights;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		heights = new int[len+1];
		int indTallest = sc.nextInt();
		int tallestHeight = sc.nextInt();
		int lines = sc.nextInt();
		Set<Point> dupes = new HashSet<Point>();
		for (int i=0; i<lines; i++)
		{
			int left = sc.nextInt();
			int right = sc.nextInt();
			if (left>right)
			{
				int temp = left;
				left = right;
				right = temp;
			}
			Point p = new Point(left, right);
			if (!dupes.contains(p))
			{
				for (int j=left+1; j<right; j++)
				{
					heights[j]--;
				}
				dupes.add(p);
			}
		}
		for (int x=1; x<heights.length; x++)
		{
			heights[x]+=tallestHeight;
			System.out.println(heights[x]);
		}
	}
}
