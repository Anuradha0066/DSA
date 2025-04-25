package TwoDArray;

public class FindElement {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target=2;
        for(int[] row:arr){
            for(int num:row){
                if(num==target){
                    System.out.println();
                    System.out.println("element found");
                    break;
                }
               
            }
        }
    }
}
