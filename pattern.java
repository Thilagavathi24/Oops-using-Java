import java.io.*;
import java.util.*;
public class Pattern
{
 public static void main(String args[])
 {
   int i,j;
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   for(i=0;i<=n;i++){
	   if(i==1||i==n)
	   {
		 for(j=0;j<=n;j++){
			 System.out.print("@ ");
		 }
		 System.out.print(" ");
	   }
	   else{
		   for(j=0;j<=n-i;j++){
			   System.out.print(" ");
		   }
		   System.out.print("# ");
		   System.out.print(" ");
	   }
      }
	  System.out.println();
 }
}
   