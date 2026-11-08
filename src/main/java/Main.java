import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // ArrayList ,
        // List-> ArrayList ,
        //
        List<Integer> numList = new ArrayList<>();

        System.out.println(numList.size());//0

        System.out.println(numList.isEmpty());//true

        numList.add(5);
        numList.add(10);
        numList.add(15);
        numList.add(20);
        numList.add(0);
        numList.add(1);
        System.out.println(numList);

        System.out.println(numList.size());//2

        System.out.println(numList.isEmpty());//false

        System.out.println(numList.contains(5));
        System.out.println(numList.contains(7));// false

        numList.remove(1);
        System.out.println(numList);

        // [5][10][15][20][25][30]

        // LinkedList node  [[prev(null)][data(5)][next[200]]]->   [[100][data(10)][300]]-> [][][]

//

        List<Integer> linkList = new LinkedList<>();
        linkList.add(2);
        linkList.add(4);
        linkList.add(6);
        linkList.add(8);
        linkList.add(10);
        System.out.println(linkList);
        System.out.println(linkList.size());
        System.out.println(linkList.isEmpty());
        System.out.println(linkList.contains(6));
        linkList.remove(3);
        System.out.println(linkList);
        System.out.println(linkList.get(3));


        List<String> languages = new LinkedList<>();
        languages.add("Java"); //[[null]["Java][1000]]
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C");
        languages.add("Java");

        System.out.println(languages);
        languages.set(3,"Kotlin");
        System.out.println(languages);


        // ArrayList vs LinkedList
        // [single value]: store 3 values (prev address, data, next address )
        // Stack -> Vector -> List
        // Set <>



    }
}
