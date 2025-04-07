package lec2;

public class PositiveNum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                System.out.println();
                System.out.println(true);
                break;
           }
           else{
            System.out.println(false);
           }
        }
    }
    
}
