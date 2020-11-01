import java.util.ArrayList;
import java.util.Scanner;

public class BestCowLine {
	private static String[] initLine;
	private static String finalLine = new String();
	private static int leftPointer;
	private static int rightPointer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		initLine = new String[n];
		for (int i=0; i<n; i++)
			initLine[i]=sc.nextLine();
		leftPointer = 0;
		rightPointer = n-1;
		

		
		while (leftPointer<rightPointer)
		{
			int temp1=leftPointer;
			int temp2=rightPointer;
			String s = "";
			String z = "";
			while (initLine[leftPointer].equals(initLine[rightPointer]))
			{
				s+=initLine[leftPointer];
				z+=initLine[rightPointer];
				leftPointer++;
				rightPointer--;
				if (leftPointer>rightPointer)
				{
					finalLine += s+z;
					while (finalLine.length()>0)
					{
						String t = "";
						if (finalLine.length()>=80)
						{
							t += finalLine.substring(0, 80);
							finalLine = finalLine.substring(80);
						}
						else
						{
							t += finalLine;
							finalLine = "";
						}
						System.out.println(t);
					}
					return;
				}
				else if (leftPointer==rightPointer)
				{
					if (s.substring(0, 1).compareTo(initLine[leftPointer])<0)
						finalLine+=s+z+initLine[leftPointer];
					else
						finalLine+=s+initLine[leftPointer]+z;
					while (finalLine.length()>0)
					{
						String t = "";
						if (finalLine.length()>=80)
						{
							t += finalLine.substring(0, 80);
							finalLine = finalLine.substring(80);
						}
						else
						{
							t += finalLine;
							finalLine = "";
						}
						System.out.println(t);
					}
					return;
				}
			}
			s+=initLine[leftPointer];
			z+=initLine[rightPointer];
			
			if (s.compareTo(z)<0)
			{
				finalLine+=initLine[temp1];
				leftPointer=temp1+1;
				rightPointer = temp2;
			}
			
			else
			{
				finalLine+=initLine[temp2];
				rightPointer=temp2-1;
				leftPointer = temp1;
			}
		}
		if (leftPointer==rightPointer)
			finalLine+=initLine[leftPointer];
		while (finalLine.length()>0)
		{
			String t = "";
			if (finalLine.length()>=80)
			{
				t += finalLine.substring(0, 80);
				finalLine = finalLine.substring(80);
			}
			else
			{
				t += finalLine;
				finalLine = "";
			}
			System.out.println(t);
		}
	}
}
/**
 * import java.util.ArrayList;
import java.util.Scanner;

public class BestCowLine {
	private static String[] initLine;
	private static String finalLine = new String();
	private static int leftPointer;
	private static int rightPointer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		initLine = new String[n];
		for (int i=0; i<n; i++)
			initLine[i]=sc.nextLine();
		leftPointer = 0;
		rightPointer = n-1;
		boolean brek = false;
		while (leftPointer<rightPointer && !brek)
		{
			int temp1=leftPointer;
			int temp2=rightPointer;
			String s = "";
			String z = "";
			while (initLine[leftPointer].equals(initLine[rightPointer]))
			{
				s+=initLine[leftPointer];
				z+=initLine[rightPointer];
				leftPointer++;
				rightPointer--;
				if (leftPointer>rightPointer && !brek)
				{
					finalLine += s+z;
					brek = true;
				}
				else if (leftPointer==rightPointer && !brek)
				{
					if (s.substring(0, 1).compareTo(initLine[leftPointer])<0)
						finalLine+=s+z+initLine[leftPointer];
					else
						finalLine+=s+initLine[leftPointer]+z;
					brek = true;
				}
			}
			if (!brek)
			{
				s+=initLine[leftPointer];
				z+=initLine[rightPointer];

				if (s.compareTo(z)<0)
				{
					finalLine+=s;
					leftPointer++;
					rightPointer = temp2;
				}

				else
				{
					finalLine+=z;
					rightPointer--;
					leftPointer = temp1;
				}
			}
		}
		if (leftPointer==rightPointer)
			finalLine+=initLine[leftPointer];
		
		while (finalLine.length()>0)
		{
			String t = "";
			if (finalLine.length()>=80)
			{
				t += finalLine.substring(0, 80);
				finalLine = finalLine.substring(80);
			}
			else
			{
				t += finalLine;
				finalLine = "";
			}
			System.out.println(t);
		}
	}
}
*/
