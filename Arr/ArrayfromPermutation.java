package Arr;

public class ArrayfromPermutation {
    public int[] buildarray(int[] arr){
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[arr[i]];

        }
        return result;
       
    }
    
    public static void main(String[] args){
        int[] arr={1,2,4,5,3};
        ArrayfromPermutation permutation=new ArrayfromPermutation();

        int[] result=permutation.buildarray(arr);
        
        for(int i=0;i<result.length;i++){
            System.out.println();
        System.out.println(result[i]);
        }
    }
    
    
}
