import java.util.Scanner;

public class CowCheckers {
	private static int[] p;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		p = new int[1000000];
		int counter = 0;
		for (int i=0; i<1000000; i++)
		{
			if (i+counter>1000000)
				break;
			if(p[i]==0)
			{
				p[i] = i+counter;
				p[i+counter]=i;
				counter++;
			}
		}
		int t = sc.nextInt();
		for (int i = 0; i<t; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (p[x]!=y)
				System.out.println("Bessie");
			else
				System.out.println("Farmer John");
		}
		sc.close();
	}
}
