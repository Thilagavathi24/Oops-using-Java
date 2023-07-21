import java.util.*;
public class element{
 public static ArrayList<Integer> two_sum_array_target(final List<Integer> a, int b) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        for(int i = 0; i < a.size(); i++){
            if(a.containsKey(a.get(i))){
                int index = a.get(a.get(i));
                result.set(0, index );
                result.set(1, i );
                break;
            }
            else{
                a.put(b - a.get(i), i);
            }}
         return result; }
  public static void main(String[] args){
        ArrayList<Integer> my_array = new ArrayList<Integer>();
        my_array.add(1);
        my_array.add(2);
        my_array.add(4);
        my_array.add(5);
		my_array.add(6);
		int target = 6;
        ArrayList<Integer> result = two_sum_array_target(my_array, target);
        for(int i : result){
            System.out.print("Index: " + i + " ");
}
}}