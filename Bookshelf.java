import java.util.Scanner;

public class Bookshelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int height = sc.nextInt();
		int[] cowHeights = new int[len];
		for (int i=0; i<len; i++)
		{
			cowHeights[i] = sc.nextInt();
		}
		sort(cowHeights);
		int x = 0;
		int index = cowHeights.length-1;
		int heightCopy = height;
		while(heightCopy>0)
		{
			heightCopy=heightCopy-cowHeights[index];
			index--;
			x++;
		}
		System.out.println(x);
	}
	public static void sort(int[] lol)
	{
		for (int i=0; i<lol.length; i++) {
			int min=i;
			for (int j=i; j<lol.length; j++) {
				if (lol[j]<lol[min])
					min=j;
			}
			int temp = lol[i];
			lol[i] = lol[min];
			lol[min]=temp;
		}
	}
}
