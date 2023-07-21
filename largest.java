import java.io.*;
import java.util.*;
class largest{
public static void main(String[] args)
{
int b,i,n;
Scanner s=new Scanner (System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for( int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
b=a[i];
a[i]=a[j];
a[j]=b;
}
}
}
System.out.println("the 2nd largest" + a[n-2]);
}}