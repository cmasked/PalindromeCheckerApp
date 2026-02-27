public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded string
        String input = "madam";

        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        System.out.println("======================================");
        System.out.println("Palindrome Checker - Use Case 2");
        System.out.println("======================================");
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result       : The string is a palindrome.");
        } else {
            System.out.println("Result       : The string is NOT a palindrome.");
        }

        System.out.println("======================================");
    }
}