package lec2;

public class even_odd {
    public static void main(String[] args) {
        int evencount=0;
        int oddcount=0;
        int[] arr={1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
              evencount++;
          }
          else{
            oddcount++;
          }
         
        }
          System.out.println();
          System.out.println(evencount);
          System.out.println(oddcount);
    }
}
