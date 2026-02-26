import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        System.out.println("=====================================================");
        System.out.println("     UC6: Queue + Stack Palindrome Checker           ");
        System.out.println("=====================================================");

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Push into stack and enqueue into queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);        // LIFO
            queue.add(ch);         // FIFO (enqueue)
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) and pop (stack)
        while (!stack.isEmpty()) {
            if (queue.remove() != stack.pop()) {   // dequeue vs pop
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}