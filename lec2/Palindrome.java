package lec2; 

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        int[] reverse=new int[arr.length];
        for(int i=arr.length-1, j=0 ; i>=0; i-- , j++ ){
            reverse[j]=arr[i];
        }
        System.out.println(Arrays.toString(reverse));
    }

}

