package TwoDArray;

public class SumOfTwo {
   
        public static void main(String[] args) {

           
        }
          public static int[][] 2DArray(int[][] arr1,int[][] arr2){
            int rows=arr1.length;
            int cols=arr1[0].length;
            int[][] sum=new int[rows][cols];
            
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                     sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            return sum;
          }
        
    
}
