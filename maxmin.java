import java.io.*;
import java.util.*;
public class maxmin
{
  public static void main(String [] args)
  {
    int a[]={10,43,75,109,130,42};
	int max=a[0];
	int min=a[0];
	for(int num : a){
	if(num>max){
	   max=num;
	 }
	else if(min>num){
	  min=num;
	 }
	}
	System.out.println(max +"  "+min);
  }
}