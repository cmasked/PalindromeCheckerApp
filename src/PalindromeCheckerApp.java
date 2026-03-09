import java.util.*;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare input string
        String input = "racecar";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for(char c : input.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while(deque.size() > 1){

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if(first != last){
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if(isPalindrome){
            System.out.println(input + " is a Palindrome.");
        }
        else{
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
}