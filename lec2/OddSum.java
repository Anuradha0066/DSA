package lec2;

public class OddSum {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={1,2,3,4,5,6};

        for(int i=1;i<arr.length;i+=2){
        sum += arr[i];
        }
        System.out.println();
        System.out.println("sum is "+ sum);
    }
}
