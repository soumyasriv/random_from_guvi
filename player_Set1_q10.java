import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String str=sc.nextLine();
    char[] ch=s.toCharArray();
    char[] ch1=str.toCharArray();
    int len=str.length();
    int count=0;
    for(int i=0;i<=len-1;i++)
    {
        if (ch[i]!=ch1[i])
        count++;
        else
        continue;
    }
    if (count==1)
    {
        System.out.println("yes");
    }
    else{
        System.out.println("no");
    }
    
    
	}
}
