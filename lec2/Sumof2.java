package lec2;
import java.util.Arrays;
import java.util.Scanner;

public class Sumof2 {
  //  public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter size");
    //     int size=sc.nextInt();

    //     System.out.println("enter array");
    //     int[] arr=new int[5];
    //     for(int i=0;i<size;i++){
    //     arr[i]=sc.nextInt();}
    //     System.out.println("enter target");
    //     int target=sc.nextInt();
    //    // int[] arr={1,2,3,4,5};
    //    int count=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]+arr[j]==target){
    //                 count +=1;
    //                 System.out.println();
    //                 System.out.println("Numbers are:"+ arr[i]+" and "+arr[j]);
                   
                  
    //             }
    //         }
    //     }
    //     System.out.println("Number of pairs "+count);

  //  }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();

        System.out.println("enter array");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();}
        System.out.println("enter target");
            int target=sc.nextInt();

            Arrays.sort(arr);

            int left=0;
            int right=size-1;
            
             while(left<right){
                int sum=arr[left]+arr[right];
    
                if(sum==target){
                    System.out.println(arr[left]+" "+arr[right]);
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
             }
    

  }
    
}
