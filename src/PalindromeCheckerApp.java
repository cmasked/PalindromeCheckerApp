import java.util.*;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "level";

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both structures
        for (char c : input.toCharArray()) {
            queue.add(c);   // enqueue
            stack.push(c);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}