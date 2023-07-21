import java.io.*;
import java.util.*;
public class arravg
{
  public static void main (String args[])
  {
    int n;
	int sum=0;
	float avg=0.0f;
    Scanner s=new Scanner(System.in);
	n = s.nextInt();
	int a[]= new int[n];
	
	for(int i=0;i<n;i++)
	{
	  a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	  sum =sum+a[i];
	}
	avg=sum/n;
	System.out.println(sum);
   }
 }