/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    int count[] =new int[n];
	    for (int i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    for (int i=0;i<n;i++)
	    {
	        count[a[i]]++;
	    }
	    for (int i=0;i<n-1;i++)
	    {
	        if (count[a[i]]==1)
	        {
	            System.out.println(a[i]);
	        }
	        
	    }
	
	}
}
