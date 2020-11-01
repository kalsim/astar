import java.io.InputStreamReader;
import java.util.Scanner;
public class CowMultiplication {
    private static int one;
    private static int two;
	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		one = sc.nextInt();
    		two = sc.nextInt();
    		int sum = 0;
    		while (one!=0)
    		{
			int temp = two;
    			while (temp!=0)
    			{
    				sum+=(one%10)*(temp%10);
    				temp/=10;
    			}
    			one/=10;
    		}
    		System.out.println(sum);
    }
}