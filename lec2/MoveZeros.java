package lec2;


public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0,  0};
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void moveZerosToEnd(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int nonZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero++;
            }
        }

        for (int i = nonZero; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
}