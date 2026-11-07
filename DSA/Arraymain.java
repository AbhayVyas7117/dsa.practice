import java.util.*;
//1.containsAll()
//2.retainAll()
//3.removeAll()

class ArrayMain {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(5);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(6);

        System.out.println("does the list1 contains all elements of list2 " + list1.containsAll(list2));
        System.out.println("the intersection of list1 and list2 is " + list1.retainAll(list2));
        System.out.println("the difference between list1 ans list2 is " + list1.removeAll(list2));
    }
}
