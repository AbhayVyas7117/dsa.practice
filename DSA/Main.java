import java.util.*;

class Main {

    public static void main(String[] args) {
        ArrayList<String> codingLanguages = new ArrayList<>();

        //1.add elements
        codingLanguages.add("java");
        codingLanguages.add("python");
        codingLanguages.add("c++");
        codingLanguages.add("javascript");

        //2. add at specific index
        codingLanguages.add(1, "Rust");
        codingLanguages.add(3, "Go");
        System.out.println(codingLanguages);

        //3.Acess and update
        System.out.println("the value at 2nd index is " + codingLanguages.get(2));
        codingLanguages.set(2, "anconda");
        System.out.println(codingLanguages);

        //4. remove element
        codingLanguages.remove(2);
        System.out.println(codingLanguages);

        //5.sort list
        //Collections.sort(codingLanguages);
        codingLanguages.sort(null);
        System.out.println(codingLanguages);
        System.out.println("the size of arraylist is " + codingLanguages.size());

        //for each
        for (String s : codingLanguages) {
            System.out.println("Language: " + s);

        }
    }
}
