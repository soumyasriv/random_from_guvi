import java.util.*
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=c.nextInt();
int k=sc.nextInt();
int temp,i;
int a[]=new int[n];
int i;
for (i=0;i<=n-1;i++)
{
a[i]=sc.nextInt();
}
while (k>0)
{
temp=a[n-1];
i=1;
while (i!=n)
{
a[n-i]=a[n-(i+1)];
i++;
}
a[0]=temp;
k--;
}
for (i=0;i<=n-1;i++)
{
System.out.print(a[i]+" ");
}
}
}
