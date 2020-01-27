import java.util.*;

class Stringdemo {
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String a[] = new String[n];
		for(int i=0;i<n;i++)
		{
			a[i] = s.next();
		}
		if(a[0].length() == a[n-1].length())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.print("No");
		}
		s.close();
	}

}