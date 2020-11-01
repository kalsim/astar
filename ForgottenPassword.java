import java.util.Scanner;

public class ForgottenPassword {
	private static String[] dp;
	private static String password;
	private static String[] dictionary;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		dp = new String[l+1];
		password = sc.nextLine();
		dictionary = new String[n];
		for (int i=0; i<n; i++)
			dictionary[i] = sc.nextLine();
		for (int i=1; i<dp.length; i++)
		{
			for (int j=0; j<dictionary.length; j++)
			{
				String s = dictionary[j];
				if (s.length()==i && isValid(s))
				{
					if (dp[i]==null)
						dp[i] = s;
					else if (s.compareTo(dp[i])<0)
						dp[i] = s;
				}
				else if (s.length()<i)
				{
					if (dp[i-s.length()]!=null)
					{
						String urmom = dp[i-s.length()]+s;
						if (isValid(urmom))
						{
							if (dp[i]==null)
								dp[i] = urmom;
							else if (urmom.compareTo(dp[i])<0)
								dp[i] = urmom;
						}
					}
				}
			}
		}
		System.out.println(dp[l]);
		sc.close();
	}
	private static boolean isValid(String s)
	{
		int len = s.length();
		for (int i=0; i<len;i++)
		{
			if (password.charAt(i)!='?' && password.charAt(i)!=s.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
}
