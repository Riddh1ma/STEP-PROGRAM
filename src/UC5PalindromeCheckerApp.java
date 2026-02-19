import java.util.Stack;
public class UC5PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String original = "madam";
        // Create Stack
        Stack<Character> stack = new Stack<>();
        // Push each character into the stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));   // Push operation
        }
        // Build reversed string by popping from stack
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();   // Pop operation
        }
        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}

