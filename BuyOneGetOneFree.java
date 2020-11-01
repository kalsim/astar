import java.util.Arrays;
import java.util.Scanner;

public class BuyOneGetOneFree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int[] a = new int[size1];
		int[] b = new int[size2];
		for (int i=0; i<size1; i++)
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i<size2; i++)
		{
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int count = 0;
		int index = 0;
		for (int i = 0; i<size1; i++)
		{
			count++;
			while (index<size2 && a[i]>b[index])
				index++;
			if (index == 0)
			{
				if (a[i]>b[index])
					count++;
			}
			else if (a[i]>b[index-1])
				count++;
		}
		System.out.println(count);
	}
}
