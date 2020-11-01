import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RegistersintheShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue[] registers = new Queue[sc.nextInt()];
		for (int j = 0; j<registers.length; j++)
			registers[j] = new LinkedList();
		Queue<Integer> line = new LinkedList<Integer>();
		while (sc.hasNext())
		{
			String s = sc.next();
			int x = sc.nextInt();
			if (s.substring(0, 1).equals("C"))
				line.add(x);
			else if (s.substring(0, 1).equals("R"))
				registers[x-1].add(line.remove());
		}
		for (int i=0; i<registers.length; i++)
		{
			System.out.print(registers[i].size() + " ");
			while (!registers[i].isEmpty())
				System.out.print(registers[i].remove() + " ");
			System.out.println();
		}
	}
}
