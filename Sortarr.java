import java.io.*;
import java.util.Arrays;
public class Sortarr
{
  public static void main(String agrs[])
  {
   int []array =new int []{90,34,56,78,22,55};
   Arrays.sort(array);
   
   System.out.println("Elements of array sorted in ascending order");
   for(int i=0;i<array.length;i++){
   System.out.println(array[i]);
  }
 }
 }
   