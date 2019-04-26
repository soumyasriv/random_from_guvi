import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] charac=s.toCharArray();
int len=s.length();
char[] ch=new char[26];
int i,j;
for( i=0;i<26;i++)
{
ch[i]=(char)(65+i);

}

for ( i=0;i<len;i++)
{
    for( j=0;j<26;j++)
    {
    if (charac[i]==ch[j])
    break;
    }
       if (j<=22)
        System.out.print(ch[j+3]);
        else if (j==23)
        {
            System.out.print(ch[0]);
        }
        else if (j==24)
                {
            System.out.print(ch[1]);
        }
        else
                {
            System.out.print(ch[2]);
        }


}
    

}}
