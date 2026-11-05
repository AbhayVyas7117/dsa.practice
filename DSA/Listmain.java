import java.util.*;

class Main {

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();

        //add element
        Numbers.add(4);
        Numbers.add(5);
        Numbers.add(13);
        Numbers.add(29);
        System.out.println(Numbers);
        Numbers.add(2, 23);
        Numbers.add(4, 30);
        System.out.println(Numbers);

        //sort
        Numbers.sort(null);
        System.out.println(Numbers);
        Collections.sort(Numbers);
        for (int i = 0; i < Numbers.size(); i++) {
            System.out.println("the value of index is " + Numbers.get(i));
        }

        for (Integer num : Numbers) {
            System.out.println("Numbers: " + num);
        }
    
}
