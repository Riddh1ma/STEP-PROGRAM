import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================================");
        System.out.println(" UC10: Case-Insensitive & Space-Ignored Palindrome Checker  ");
        System.out.println("=============================================================");

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Step 1: Normalize string
        // Convert to lowercase and remove all spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Check palindrome using two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome (ignoring case & spaces).");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}