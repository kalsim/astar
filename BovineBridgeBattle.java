import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BovineBridgeBattle {
	private static int n;
	private static int[][] points;
	private static Map<Point2D.Double, Integer> m;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		points = new int[n][2];
		m = new HashMap<Point2D.Double, Integer>();
		for (int i=0; i<n; i++)
		{
			points[i][0] = sc.nextInt();
			points[i][1] = sc.nextInt();
		}
		sc.close();
		for (int i=0; i<n-1; i++)
		{
			for (int j=i+1; j<n; j++)
			{
				if (j!=i)
				{
					double x = ((double)points[i][0]+points[j][0])/2;
					double y = ((double)points[i][1]+points[j][1])/2;
					Point2D.Double p = new Point2D.Double(x, y);
					if (m.get(p)==null)
						m.put(p, 1);
					else
					    m.put(p, m.get(p)+1);
				}
			}
		}
		int ans = 0;
		for (Point2D.Double x: m.keySet())
			ans+= (m.get(x)*(m.get(x)-1))/2;
		System.out.println(ans);
	}
}
