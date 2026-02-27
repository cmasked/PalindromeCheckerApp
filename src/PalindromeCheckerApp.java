public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display input and reversed string
        System.out.println("======================================");
        System.out.println("Palindrome Checker - Use Case 3");
        System.out.println("======================================");
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed strings
        if (input.equals(reversed)) {
            System.out.println("Result          : The string is a palindrome.");
        } else {
            System.out.println("Result          : The string is NOT a palindrome.");
        }

        System.out.println("======================================");
    }
}