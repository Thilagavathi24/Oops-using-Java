import java.io.*;
public class Arrconcat
{
  public static void main(String args[])
  {
    int arr1[]={1,2,3,4};
    int arr2[]={8,5,3,7};
	System.out.print("intersection of Arrays");
	 for(int i=0;i<arr1.length;i++){
	 for(int j=0;j<arr2.length;j++){
	  if(arr1[i]==arr2[j])
	  {
	    System.out.println(arr1[i]);
	  }
	 }
	}
   }
}
	     