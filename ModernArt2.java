import java.util.Scanner;

public class ModernArt2 {
	private static int n;
	private static int[] art;
	private static int[] count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		art = new int[n];
		for (int i=0; i<n; i++)
			art[i] = sc.nextInt();
		int count = 1;
		System.out.println(count+1);
    }
}
