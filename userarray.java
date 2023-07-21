import java.io.*;
import java.util.*;
public class userarray
{
  public static void main (String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
	n = s.nextInt();
	int a[]= new int[n];
	System.out.println("Enter the elements of array:");
	for(int i=0;i<n;i++)
	{
	  a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	  System.out.println(a[i]);
	}
   }
 }