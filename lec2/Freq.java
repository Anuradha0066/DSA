package lec2;

import java.util.HashMap;
import java.util.Map;

public class Freq {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};
        Map<Integer, Integer> frequencyMap = new HashMap<>(); 

        for (int i = 0; i < arr.length; i++) {
            if (frequencyMap.containsKey(arr[i])) { 
                int freq = frequencyMap.get(arr[i]); 
                freq++;
                frequencyMap.put(arr[i], freq);

            } else {
                frequencyMap.put(arr[i], 1);
                
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

    }
}