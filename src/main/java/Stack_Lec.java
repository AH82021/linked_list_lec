import java.util.List;
import java.util.Stack;

public class Stack_Lec {
    public static void main(String[] args) {

        List<Integer> stack = new Stack<>();

        //
        String name = "Joe";// [stack [name-> 2021] , heap([["Joe"]])]

        name = "John"; //[stack[name -> 2022]] [heap[["John"]]

          name = name + " Khan";

        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.remove(2);
        System.out.println(stack);

        Stack<Integer> stack2 = new Stack<>();
        //
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(-1);
        stack2.push(5);
        System.out.println(stack2.peek());
        stack2.pop();
        System.out.println(stack2.peek());
        System.out.println(stack2);
        System.out.println(stack2.search(-1));
        // empty method

        System.out.println(stack2.empty());

        //[4m, 1k]
        //-1
        //4
        //3
        // 2

        // Kabul -> lubak
        // [k,a,b,u,l]-> stack[k,a,b,u,l] -> "lubak"

        // Tom, mot
        // mot -> tom
        // wow -> wow
        // lol -> lol

        System.out.println(reversedString("Kabul"));
        System.out.println(reversedString("WoW"));
        System.out.println(reversedString("Ajmal"));

        //"{([})" -> { }, (), [, , false
        // Valid Parentheses , stack , (, ) , {}, [, ],]

    }


    public static String reversedString(String str) {

        StringBuilder result = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        System.out.println(stack);

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();

    }
}
