import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int value : arr) {
            stack.push(value);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        reverseArray(arr);

        System.out.println("\nReversed array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
