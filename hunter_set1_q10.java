
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0;
		int a[]=new int[n1];
		int b[]=new int[n2];
		for (int i=0;i<n1;i++)
		{
		    a[i]=sc.nextInt();
		}
		for (int i=0;i<n2;i++)
		{
		    b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		
		for (int i=0;i<n2;i++)
		{
		    int j=0;
		    for ( j=0;j<n2;j++)
		    {
		    if (b[j]==a[i])
		    {
			count++;
			break;
		    }
		    else
		    continue;
		    }

		}
		if (count<=n2 && count!=0)
		{
		    System.out.println("YES");
		}
		else if (count==0){
		    System.out.println("NO");
		}
		}
		
	}

