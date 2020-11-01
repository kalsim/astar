import java.util.Scanner;

public class CowLine {
	private static int[] line;
	private static int left;
	private static int right;
	private static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		line = new int[300000];
		left = 150000;
		right = 149999;
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=0; i<n; i++)
		{
			String s = sc.nextLine();
			String dir = s.substring(2, 3);
			if (s.length()>3)
			{
				int x = Integer.parseInt(s.substring(4));
				if (dir.equals("R"))
				{
					for (int j=0; j<x; j++)
						removeRight();
				}
				else
				{
					for (int j=0; j<x; j++)
						removeLeft();
				}
			}
			else
			{
				if (dir.equals("R"))
					addRight();
				else
					addLeft();
			}
		}
		for (int z = left; z<=right; z++)
		{
			System.out.println(line[z]);
		}
	}
	public static void addLeft()
	{
		left--;
		count++;
		line[left] = count;
	}
	public static void addRight()
	{
		right++;
		count++;
		line[right]=count;
	}
	public static void removeLeft()
	{
		left++;
	}
	public static void removeRight()
	{
		right--;
	}
}
