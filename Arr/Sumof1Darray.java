package Arr;

import java.util.Arrays;

public class Sumof1Darray {
   
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] sum=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=0;j<=i;j++){
             currentSum+=arr[j];
        
            } 
          sum[i]=currentSum;
        }
        System.out.println(Arrays.toString(sum));
    }

}
