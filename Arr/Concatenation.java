package Arr;
import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args){
    int[] arr={1,2,3};
    int[] arr2={4,5,6};
   
    int[] result=concatenateArrays(arr,arr2);
    System.out.println(Arrays.toString(result));
    
    
}

    public static int[] concatenateArrays(int[] arr, int[] arr2) {
      int[] result=new int[arr.length+arr2.length];
      System.arraycopy(arr,0,result,0,arr.length);
      System.arraycopy(arr2,0,result,arr.length,arr2.length);
      
      return result;
    }
}

