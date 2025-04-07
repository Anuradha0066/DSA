package Conditional;

import java.util.HashMap;
import java.util.Map;

public class Nonrepeating {
    
    public static void main(String[] args) {
         int[] arr = {1, 2, 3, 2, 1};
       
          
        Map<Integer, Integer> indexMap = new HashMap<>(); 
      int flag=-1;
        for (int i = 0; i < arr.length; i++) {
            if (indexMap.containsKey(arr[i])) { 
                int index = indexMap.get(arr[i]); 
              
                indexMap.put(arr[i], flag);
               

            } else {
                indexMap.put(arr[i], i);
                
            }
        }
     








        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

    }
}
