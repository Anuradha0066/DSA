package Practice_Question;

public class Dutch_National_Flag {
    public static void main(String[] args) {
        int[] arr={2,1,2,0,2,1};

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
