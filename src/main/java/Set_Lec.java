import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Lec {
    public static void main(String[] args) {

        // Set -> HashSet , LinkedHashSet , TreeSet

        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);

        Set<String> set = new HashSet<>();
        // Data base , SQL

        set.add(null);
        set.add(null);
        set.add("Ahmad");
        set.add("Ahmad");
        set.add("Tom");
        set.add("Tony");
        set.remove(null);

        System.out.println(set.size());
        System.out.println(set);

        String name ;

        Book book1 = new Book(1,"Java","Tom");
        Book book2 = new Book(2,"Kotlin","Alex");
        Book book3 = new Book(1,"Java","Tom");// equlas , hashCode

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        System.out.println(bookSet);

    }
}
