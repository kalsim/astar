import java.util.Scanner;
import java.util.Stack;

public class RobotWorld {
	public static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		count = 1;
		int x = sc.nextInt();
		Stack<Integer> s = new Stack<Integer>();
		for (int i=0; i<=x; i++)
		{
			String y = sc.nextLine();
			if (y.equals("ADD"))
			{
				s.push(count);
				count++;
			}
			else if (y.equals("REMOVE"))
				s.pop();
		}
		Stack<Integer> o = new Stack<Integer>();
		while (!s.isEmpty())
			o.push(s.pop());
		System.out.println(o.size());
		while (!o.isEmpty())
			System.out.println(o.pop());
	}
}
