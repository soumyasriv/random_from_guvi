import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp;
		for (int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		 for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
	
		for(int i=0;i<n;i++)
		{
		    if (a[i]==a[i+1])
		    {
		        if (a[i]!=a[i-1])
		        System.out.print(a[i]+" ");
		    }
		    
		   
		   		}
		
		
		
	}
}
