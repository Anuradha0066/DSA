package String;

public class Palindrome {
    public static void main(String[] args) {
        String str="madam";
        System.out.println();
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse +=str.charAt(i);       
         }
         System.out.println();
         System.out.println(reverse);
         if(str.equals(reverse)){
         System.out.println("Palindrome");
         }
         else{
            System.out.println("not pallindrome");
         }
    }
}
