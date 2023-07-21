import java.io.*;
import java.util.Arrays;
public class Arrneg1{
public static void main(String args[])
 {
   int[] nums = {1,-2, -5,-4,3,-6};
   Boolean result=false;
   
   System.out.printf(Arrays.toString(nums));
   long count_negative, count_positive;
    nums = Arrays.stream(nums).distinct().toArray();
    count_negative = Arrays.stream(nums).filter(s -> s < 0).count();
    count_positive = Arrays.stream(nums).filter(s -> s > 0).count();
	if( count_negative > count_positive){
	  result = true;
	}
	 System.out.print(result);
 }
}