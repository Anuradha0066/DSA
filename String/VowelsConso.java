package String;

public class VowelsConso {
    public static void main(String[] args){
    String str = "Orange";

    int vowelCount = 0;
    int consonantCount = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        
    }

     System.out.println("Vowel count: " + vowelCount);
        System.out.println("Consonant count: " + consonantCount);
    }


}