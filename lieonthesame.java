
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int r=3;
	  int c=2;
	  int count=0;
	  int a[][]=new int[r][c];
	  for (int i=0;i<r;i++)
	  {
	    for (int j=0;j<c;j++)  
	      {
	          a[i][j]=sc.nextInt();
	      }
	      
	  }
	  for (int i=0;i<r-1;i++)
	  {
	      if (a[i][0]==a[i+1][0] || a[i][1]==a[i+1][1])
              count+=1;
	  }
	  if (count==r-1)
	  	      System.out.println("yes");
	  else 
	  System.out.println("no");

	}
}
