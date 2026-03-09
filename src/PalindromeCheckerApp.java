import java.util.*;

interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeStrategy stackStrategy = new StackStrategy();
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long start, end;

        // Stack Strategy timing
        start = System.nanoTime();
        boolean stackResult = stackStrategy.checkPalindrome(input);
        end = System.nanoTime();
        long stackTime = end - start;

        // Deque Strategy timing
        start = System.nanoTime();
        boolean dequeResult = dequeStrategy.checkPalindrome(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("\nResults:");
        System.out.println("Stack Strategy Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");

        System.out.println("Deque Strategy Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");

        sc.close();
    }
}