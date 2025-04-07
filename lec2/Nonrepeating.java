package lec2;

public class Nonrepeating {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,2};
        System.out.println();
        for(int i=0;i<arr.length;i++){
            boolean unique= true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
              unique =false;
                break;
            }}
            if(unique){
             System.out.println(arr[i]);
            }
        }
    }
}
