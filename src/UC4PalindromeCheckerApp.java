public class UC4PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded input string
        String original = "racecar";
        // Variable to store reversed string
        String reversed = "";
        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }
        // Compare original and reversed using equals() method
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}

