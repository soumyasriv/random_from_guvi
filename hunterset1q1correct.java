import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int a[]=new int[n+1];
	 int count=0;
	 int temp;
	 a[0]=-4569;
	 for (int i=1;i<=n;i++)
	 {
	     a[i]=sc.nextInt();
	 }
	
        for (int i = 1; i <= n; i++) 
        {
            for (int j = i + 1; j<=n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=1;i<n;i++)
        {
            if (a[i]==a[i+1])
            {
                if (a[i]!=a[i-1])
                {
                    System.out.print(a[i]+" ");
                }
            
            }
            else
            count++;
        }
        if (count==n-1)
        {
            System.out.println("Unique");
        }
	}
}
