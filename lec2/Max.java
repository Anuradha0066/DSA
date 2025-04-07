package lec2;

public class Max {
//     public static void main(String[] args) {
//         int max=0;
//         int[] arr={1,2,3,4,5};
//         for(int i=0;i<=4;i++)
//         {
//             if(arr[i]>max){
//                 max=arr[i];
//                  max1();
//             }
//         }
//         System.out.println();
//       //  System.out.println(max);
//     }
//     public static int max1(){
//        int max=0;
//        System.out.println(max);
//     }
// }



    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
