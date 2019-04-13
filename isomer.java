import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=sc.nextLine();
		char[] ch=s.toCharArray();
		char[] ch1=str.toCharArray();
		
		    if (ch[0]==ch[1] || ch[0]==ch[1] && ch[1]==ch[2])
		    {
		            if (ch1[0]==ch1[1] || ch1[0]==ch1[1] && ch1[1]==ch1[2])
		            System.out.println("yes");
		            else
		            System.out.println("no");
		     }
		    }
		
	
}
