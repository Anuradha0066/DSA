// package lec2;

// import java.util.Arrays;

// public class Reverse {
//     public static void main(String[] args){

//      int[] arr={1,2,3,4,5};
//      int[] reverse=new int[arr.length];
//     int j;
//     for (int i=arr.length-1;j=0; i>=0;i--;j++){
//       reverse[j]=arr[i];
//        // System.out.println(arr[i]);
//     }
//     System.out.println(Arrays.toString(arr));

// }
// }


package lec2;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }

        System.out.println(Arrays.toString(reversedArr));
    }
}