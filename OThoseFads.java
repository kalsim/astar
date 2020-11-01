import java.util.Arrays;
import java.util.Scanner;

public class OThoseFads {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a = sc.nextInt();
		int c = sc.nextInt();
		int[] x = new int[size];
		for (int i = 0; i<size; i++)
		{
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		int index = 0;
		while (index<size && a>=x[index])
		{
			index++;
			a+=c;
		}
		System.out.println(index);
	}
}
