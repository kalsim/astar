import java.util.Scanner;

public class LonesomePartners {
	private static int[][] coordinates;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		coordinates = new int[n][2];
		for (int i=0; i<n; i++)
			for (int j=0; j<2; j++)
				coordinates[i][j] = sc.nextInt();
		int cow1 = 0;
		int cow2 = 0;
		double maxDist = 0;
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
				double d = Math.sqrt(Math.pow(coordinates[j][1]-coordinates[i][1], 2)+Math.pow(coordinates[j][0]-coordinates[i][0], 2));
				if (d>maxDist)
				{
					cow1=i;
					cow2=j;
					maxDist = d;
				}
			}
		}
		System.out.println(Math.min(cow1, cow2) + " " + Math.max(cow1, cow2));
	}
}
