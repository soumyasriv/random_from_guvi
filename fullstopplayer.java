import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();

char[] ch=str.toCharArray();
int length=ch.length;
String s="";
for(int i=0;i<=length-1;i++)
{
s+=ch[i];
} 
System.out.print(s+'.');
}
}
