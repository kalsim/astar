import java.io.InputStreamReader;
import java.util.Scanner;

public class StringFunctionEncoding {
	public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int x = sc.nextInt();
        for (int i=0; i<x; i++)
        {
        		int y = sc.nextInt();
        		int times = sc.nextInt();
        		String str = sc.nextLine();
        		str = str.substring(1);
        		for (int j = 0; j<times; j++)
        		{
        			str = str.substring(y) + str;
        		}
        		System.out.println(str);
        }
	}
}
