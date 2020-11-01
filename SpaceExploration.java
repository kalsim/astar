import java.util.Scanner;

public class SpaceExploration {
	private static int[][] lol;
	private static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		lol = new int[n][n];
		count = 0;
		sc.nextLine();
		for (int i=0; i<10; i++)
		{
			String s = sc.nextLine();
			for (int j=0; j<10; j++)
			{
				if (s.substring(j, j+1).equals("."))
					lol[i][j] = 0;
				else
					lol[i][j] = 1;
			}
		}
		
		
		for (int a=0; a<10; a++)
		{
			for (int b=0; b<10; b++)
			{
				if (lol[a][b] == 1);
				{
					count++;
					ff(a, b, 2);
					/**for (int x=0; x<10; x++)
					{
						for (int y=0; y<10; y++)
						{
							System.out.print(lol[x][y]);
						}
						System.out.println();
					}
					return;
					for some reason ff doesnt change anything
					*/
				}
			}
		}
		System.out.println(count);
		sc.close(); 
	}
	public static int ff(int r, int c, int k)
	{
		if (r<0 || r>=lol.length || c<0 || c>=lol[0].length)
			return 0;
		//if at r c it equals k return
		if (lol[r][c]!= 1)
			return 0;
		lol[r][c] = k;
		return ff(r-1, c, k)+ff(r+1, c, k)+ff(r, c-1, k)+ff(r, c+1, k)+1;
	}
}
