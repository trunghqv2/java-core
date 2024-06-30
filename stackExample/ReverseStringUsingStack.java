
import java.util.Stack;


public class ReverseStringUsingStack {

    public static String reverseString(String input) {
        Stack<String> wStack = new Stack<>();
        String[] words = input.split(" ");

        for (String word : words) {
            wStack.push(word);
        }

        StringBuilder reversedString = new StringBuilder();
        while (!wStack.isEmpty()) {
            reversedString.append(wStack.pop());
            if (!wStack.isEmpty()) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("Original string:");
        System.out.println(input);

        String reversed = reverseString(input);

        System.out.println("Reversed string:");
        System.out.println(reversed);
    }
}
