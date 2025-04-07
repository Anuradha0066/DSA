package lec2;

public class Missingvalue {
    public static void main(String[] args) {
        int sum=0;
        int[] arr={2,3,1,5};
        for(int i=0;i<arr.length;i++){

            sum += arr[i];
        }
        System.out.println("sum "+sum);

        int n=arr.length+1;
        System.out.println(arr.length);
        int a=n*(n+1)/2;
        System.out.println(a-sum);
    }
    
}
