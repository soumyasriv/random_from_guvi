import java.util.*;
class Solution
{
publilc static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int n=sc.nextInt();
char[] ch=str.toCharArray();
String s=" ";
int length=ch.length;
int start=length-n;
for (int i=start;i<=length-1;i++)
{
s+=ch[i];
}
System.out.println(s);
}}
