package lec2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstRepeating {
    // public static void main(String[] args) {
    //     int[] arr={1,2,3,1,2};
    //     System.out.println();
    //     for(int i=0;i<arr.length;i++){
          
    //         for(int j=0;j<arr.length;j++){
    //             if(i!=j && arr[i]==arr[j]){
           
    //         System.out.println("first repeating "+arr[i]);
    //          return;
    //         }}
           
    //     }
    // }


    public static void main(String[] args) {
        int[] arr={1,2,3,2,1};
        Integer firstrepeating = null;

        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                firstrepeating = arr[i];
                break;
            }
        }
        System.out.println();
        System.out.println("1st Repeating "+firstrepeating);
    }
}
