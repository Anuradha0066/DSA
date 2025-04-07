package lec2;

public class index {
    public static int find(int[] arr,int target) {
    for(int i=0;i < arr.length;i++){
       if(arr[i]==target){
        return i;
       }
       
    }
    return -1;
    
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        System.out.println();
        System.out.println(find(arr, target)); 


        int[] arr2 = {2, 4, 6, 8, 10};
        int target2 = 5;
        System.out.println(find(arr2, target2));
    }
    
}
