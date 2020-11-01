import java.util.Scanner;

public class Overplanting {
	private static int[][] rect;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		rect = new int[n][4];
		for (int i=0; i<n; i++)
			for (int j=0; j<4; j++)
				rect[i][j] = sc.nextInt();
		int area = (rect[0][2]-rect[0][0])*(rect[0][1]-rect[0][3]);
		for (int i = 1; i<n; i++)
		{
			area+=(rect[i][2]-rect[i][0])*(rect[i][1]-rect[i][3]);
			area-=(rect[i-1][2]-rect[i][0])*(rect[i][1]-rect[i][3]);
		}
		System.out.println(area);
		sc.close();
	}
}
