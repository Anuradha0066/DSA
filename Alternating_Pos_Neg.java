package Practice_Question;

public class Alternating_Pos_Neg {
    public static void main(String[] args) {
        int[] arr= {1, 2, -3, -1, -2, 3};
        int[] arr1=new int[arr.length];
        int[] pos=new int[arr.length];
         int[] neg=new int[arr.length];
        int posCount=0,negCount=0;

         for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
              neg[negCount++]=arr[i];
            // negCount++;
             
            }
            else{
                pos[posCount++]=arr[i];
               //posCount++;
            }
            }

             boolean turn =arr[0]>=0;
             int p=0,n=0,i=0;
           while (p<posCount && n<negCount) {
            if (turn) {
                arr1[i++]=pos[p++];
            }
            else{
                arr1[i++]=neg[n++];
            }
            turn = !turn;
           }

        while (p < posCount) {
           arr1[i++] = pos[p++];
        }
        while (n < negCount) {
            arr1[i++] = neg[n++];
        }

           for(int num:arr1){
            System.out.println(num);
           }
        
        
    }
}
