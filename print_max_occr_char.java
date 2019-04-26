
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char[] ch=s.toCharArray();
	    int count[]=new int[256];
	    int len=s.length();
	    for (int i=0;i<len;i++)
	    {
	        count[s.charAt(i)]++;
	    }
	   int  max=-1;
	   char result=' ';
	   for (int i=0;i<len;i++)
	   {
	       if (max < count[s.charAt(i)])
	       {
	           max=count[s.charAt(i)];
	           result=s.charAt(i);

	       }
	   }
	   	           System.out.println(result);
	    
	    
	}
}
