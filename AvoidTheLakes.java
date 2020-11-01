import java.util.Scanner;

public class AvoidTheLakes {
	static String[][] lol;
	static int r;
	static int c;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		lol = new String[r+2][c+2];
		for (int i=0; i<sc.nextInt(); i++)
		{
			lol[sc.nextInt()][sc.nextInt()] = "#";
		}
		for (int i=1; i<=r; i++)
		{
			for (int j=1; j<=c; j++)
			{
				if (!lol[i][j].equals("#"))
					lol[i][j] = ".";
			}
		}
		int count = 0;
		for (int i=1; i<=r; i++)
		{
			for (int j=1; j<=c; j++)
			{
				count++;
				floodfill(i, j, count);
			}
		}
		int[] lakes = new int[count+1];
		for (int i=1; i<lakes.length; i++)
		{
			// go through the 2d array and check which ones r equal, put in array, output max val
		}
	}
	public static boolean spread(int x)
	{
		boolean expand = false;
		for (int i=1; i<=r; i++)
		{
			for (int j = 1; j<=c; j++)
			{
				if (lol[i+1][j].equals(x+"") && lol[i][j].equals("#"))
				{
					lol[i][j] = x + "";
					expand = true;
				}
				if (lol[i+1][j].equals(x+"") && lol[i][j].equals("#"))
				{
					lol[i][j] = x + "";
					expand = true;
				}
				if (lol[i+1][j].equals(x+"") && lol[i][j].equals("#"))
				{
					lol[i][j] = x + "";
					expand = true;
				}
				if (lol[i+1][j].equals(x+"") && lol[i][j].equals("#"))
				{
					lol[i][j] = x + "";
					expand = true;
				}
			}
		}
		return expand;
	}
	public static void floodfill(int row, int col, int count)
	{
		lol[row][col] = count + "";
		while (spread(count));
	}
}
