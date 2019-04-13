import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] ch=str.toCharArray();
int length=ch.length;
for(int i=length-1;i>=0;i--)
{
System.out.print(ch[i]);
}
}
}
