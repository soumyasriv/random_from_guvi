
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int temp;
    for(int i=0;i<=n-1;i++)
    {
        a[i]=sc.nextInt();
    }
    for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        if (a[0]==0)
        {
            System.out.print(0);
        }
        else{
    for(int i=0;i<=n-1;i++)
    { 
        
        
        System.out.print(a[i]);
    }

        }
	}
}
