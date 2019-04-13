import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char temp;
		
		char[] ch=s.toCharArray();
		int len=ch.length;
		int n=len-1;
		for (int i=0;i<=n/2;i++)
		{
		    temp=ch[2*i];
		    ch[2*i]=ch[2*i+1];
		    ch[2*i+1]=temp;
		}
		System.out.println(ch);
		    }
		
	
}
