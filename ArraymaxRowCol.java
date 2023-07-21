import java.io.;
import import.Scanner;
public class ArraymaxRowCol
{
	public static void main(String args[])
	{
		int arr[][]={{1,2,3},
		             {4,5,6},
				     {7,8,9}
		            };
					
	for(int row=0; row<arr.length;row++)
	{
		print(findMaxRow(arr,row));
	}
	public int findMaxRow(int[][]arr,int row)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr[0];