// in code we are using HashMap to count the frequency of each number in a list.
import java.util.*;
public class List {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 1, 1, 1, 1, 5, 6, 2, 4, 4, 2,
                        3, 4, 5, 6, 7, 8, 9, 1, 4, 5)
        );

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i : list) {
            if (freqMap.containsKey(i)) {
                int freqOfKey = freqMap.get(i);
                freqMap.put(i, freqOfKey + 1);
            } else {
                freqMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Key: " + entry.getKey()
                    + ", Frequency: " + entry.getValue());
        }

        System.out.println(freqMap);
    }
}
