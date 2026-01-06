
//     public static void main(String[] args) {
//         // this leed is find the how many push we need  to find that word like old mobile 
//     }
// }


import java.util.*;

public class leet3014 {
    public int minimumPushes(String word) {
        // Step 1: Frequency count
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : word.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Collect and sort frequencies in descending order
        List<Integer> counts = new ArrayList<>(freq.values());
        counts.sort(Collections.reverseOrder());

        // Step 3: Calculate pushes
        int pushes = 0;
        for (int i = 0; i < counts.size(); i++) {
            pushes += (i / 8 + 1) * counts.get(i);
        }

        return pushes;
    }
}
