package lec2;

public class SecondLargest{


public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5};
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > secondMax && arr[i] < max) {
            secondMax = arr[i];
        }
    }
    System.out.println("second largest " + secondMax);

}
}