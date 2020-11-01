import java.util.Scanner;

public class DinnerTime {
	private static int[] cx;
	private static int[] cy;
	private static int[] sx;
	private static int[] sy;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cx = new int[sc.nextInt()];
		cy = new int[cx.length];
		sx = new int[sc.nextInt()];
		sy = new int[sx.length];
		for (int i=0; i<cx.length; i++)
		{
			cx[i] = sc.nextInt();
			cy[i] = sc.nextInt();
		}
		for (int j=0; j<sx.length; j++)
		{
			sx[j] = sc.nextInt();
			sy[j] = sc.nextInt();
		}
	}
}
