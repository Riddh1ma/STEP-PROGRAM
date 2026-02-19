import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class UC6PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded string
        String original = "level";
        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();
        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();
        // Push into Stack and Enqueue into Queue
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO (Enqueue)
        }
        // Compare characters using Dequeue and Pop
        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();     // Pop (LIFO)
            char fromQueue = queue.remove();  // Dequeue (FIFO)
            if (fromStack != fromQueue) {
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

