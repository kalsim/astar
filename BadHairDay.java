import java.awt.Point;
import java.util.Scanner;
import java.util.Stack;

public class BadHairDay {
	public static int[] lol;
	public static Stack<Point> stacc;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		lol = new int[len];
		for (int i=0; i<len; i++)
			lol[i]=sc.nextInt();
		stacc = new Stack<Point>();
		stacc.push(new Point(lol[0], 0));
		long sum = 0;
		for (int i=1; i<lol.length; i++)
		{
			while (!stacc.isEmpty() && lol[i]>=stacc.peek().getX())
			{
				sum+=i-stacc.peek().getY()-1;
				stacc.pop();
			}
			stacc.push(new Point(lol[i], i));
			//while the current one is greater than 
				//on the stack keep popping and subtracting indeces and adding
			// then push current one on
		}
		while (!stacc.isEmpty())
		{
			sum+=lol.length-stacc.peek().getY()-1;
			stacc.pop();
			//length of lol array-index-1 add to sum and pop
		}
		System.out.println(sum);
		sc.close();
	}
}
