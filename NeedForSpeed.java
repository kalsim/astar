import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NeedForSpeed {
	private static int[][] lol;
	private static int f;
	private static int m;
	private static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		f = sc.nextInt();
		m = sc.nextInt();
		n = sc.nextInt();
		lol = new int[n][3];
		for (int i=0; i<n; i++)
		{
			lol[i][0] = i+1;
			for (int j=1; j<3; j++)
				lol[i][j] = sc.nextInt();
		}
		Arrays.sort(lol, new Comparator<int[]>() {
		    public int compare(int[] a, int[] b) {
		    		double x = a[1]/(double)a[2];
		    		double d = b[1]/(double)b[2];
		        return Double.compare(d, x);
		    }
		});
		int index=0;
		int curf = f;
		int curm = m;
		double curavg = (double)f/m;
		for (int i=0; i<n; i++)
		{
			int tempf = curf+lol[i][1];
			int tempm = curm+lol[i][2];
			double tempavg = (double)tempf/tempm;
			if (tempavg<curavg)
			{
				index=i-1;
				break;
			}
			curf=tempf;
			curm=tempm;
			curavg=tempavg;
		}
		if (index<0)
			System.out.println("NONE");
		else
		{
			int[] temp = new int[index+1];
			for (int i=0; i<=index; i++)
			{
				temp[i] = lol[i][0];
			}
			Arrays.sort(temp);
			for (int x:temp)
				System.out.println(x);
		}
		sc.close();
	}
}
