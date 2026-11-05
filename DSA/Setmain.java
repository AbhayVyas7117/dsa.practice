// in this code we are learning hashset and treeset in java.
import java.util.*;

class Setmain {

    public static void main(String[] args) {
        Set<String> cars1 = new HashSet<>();
        Set<String> cars2 = new TreeSet<>();

        //adding value int the hashset - .add()
        cars1.add("maruti");
        cars1.add("kia");
        cars1.add("Toyota");
        cars1.add("Maruti");
        cars1.add("kia");
        cars2.add("maruti");
        cars2.add("kia");
        cars2.add("Toyota");
        cars2.add("Maruti");
        cars2.add("kia");

        System.out.println(cars1);
        System.out.println(cars2);

        //check if a value is present in set 
        if (cars1.contains("Maruti")) {
            System.out.println("Maruti is present");
        }
        if (cars1.contains("volvo")) {
            System.out.println("volvo is present");
        } else {
            System.out.println("volvo is not present");
        }
        for (String s : cars1) {
            System.out.println("car: " + s);
        }
        // removing an item
        cars1.remove("Maruti");
        System.out.println(cars1);
    }
}
