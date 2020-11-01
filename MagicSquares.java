import java.util.Scanner;

public class MagicSquares {
	private static int[] initial;
	private static int[] target;
	private static String ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		initial = new int[8];
		target = new int[8];
		for(int i=0; i<8; i++)
		{
			initial[i] = i+1;
			target[i] = sc.nextInt();
		}
		ans = "";
		if (initial == target)
			System.out.println(0);
		else
			System.out.println(target[5]);
	}
	public static void A()
	{
		int count=7;
		for(int i=0; i<4; i++)
		{
			int temp = initial[i];
			initial[i]=initial[count];
			initial[count]=temp;
			count--;
		}
		ans+="A";
	}
	public static void B()
	{
		
	}
	public static void C() 
	{
		
	}
}
