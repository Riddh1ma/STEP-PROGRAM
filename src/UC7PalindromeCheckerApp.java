import java.util.Deque;
import java.util.LinkedList;
public class UC7PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String original = "radar";
        // Create Deque (Double Ended Queue)
        Deque<Character> deque = new LinkedList<>();
        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));  // Insert at rear
        }
        // Compare front and rear elements
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear
            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }
        // Display result
        if (isPalindrome) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}
