import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class FuelEconomy {
	private static int n; // fuel stations
	private static int g; // tank max capacity
	private static int b; // starting fuel
	private static int d; // distance to travel
	private static Stack<Integer> s;
	private static int[] closest;
	private static int[][] stations;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		g = sc.nextInt();
		b = sc.nextInt();
		d = sc.nextInt();
		closest = new int[n+1];
		stations = new int[n+1][2];
		s = new Stack<Integer>();
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<2; j++)
				stations[i][j] = sc.nextInt();
		}
		
		stations[n][0] = d;
		stations[n][1] = Integer.MAX_VALUE;
		
		Arrays.sort(stations, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		        return Integer.compare(a[0], b[0]);
		    }
		});
		
		//Idea is to use a stack
		/*
		 * cows have bad hair problem
		 * stack: 12 15 17
		 * keep increasing stack
		 * then at 7 remove all
		 * stack: 7 then 40
		 */
		
		for (int i=n; i>=0; i--)
		{
			while (!s.isEmpty() && stations[s.peek()][1]>=stations[i][1])
				s.pop();
			if (s.isEmpty())
				closest[i]=Integer.MAX_VALUE;
			else
				closest[i]=s.peek();
			s.push(i);
		}
		
		b-=stations[0][0];
		long cost = 0;
		for (int i=0; i<=n; i++)
		{
			if (b<0)
			{
				System.out.println(-1);
				return;
			}
		
			int x=Integer.MAX_VALUE;
			if (closest[i]!=Integer.MAX_VALUE)
				x = stations[closest[i]][0]-stations[i][0];
			else
			{
				if (d-stations[i][0]<=g)
				{
					cost+=(long)(d-stations[i][0]) * (long) stations[i][1];
					System.out.println(cost);
					return;
				}
			}
			int next = Math.min(g, x);
			if (next>b)
			{
				cost += (long) (next - b) * (long) stations[i][1];
				b=next;
			}
			if (i+1<=n)
			{
				b -= (stations[i+1][0] - stations[i][0]);	
			}
		}
	}
}
