// in this code we are using HashMap to store the roll number and name of the student.
import java.util.*;

class Roll {

    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<>();

        student.put(64, "Kashish");
        student.put(68, "Ananya");
        student.put(75, "Ayan");
        student.put(95, "Rashi");

        System.out.println(student);

        student.put(64, "Harshita");
        System.out.println(student);

        System.out.println("The value at the 68 key is " + student.get(68));

        // Iterating a map
        for (Map.Entry<Integer, String> entry : student.entrySet()) {
            System.out.println("The key is " + entry.getKey()
                    + " and the value is " + entry.getValue());
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
    }
}

