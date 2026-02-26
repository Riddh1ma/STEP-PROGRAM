import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    // Reverse String Approach
    public static boolean reverseMethod(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    // Stack Approach
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Deque Approach
    public static boolean dequeMethod(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    // Recursive Approach
    public static boolean recursiveMethod(String input, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }
        return recursiveMethod(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "racecar";  // Hardcoded for consistent benchmarking

        System.out.println("=================================================");
        System.out.println(" UC13: Performance Comparison of Algorithms     ");
        System.out.println("=================================================");

        // Reverse Method Timing
        long startTime = System.nanoTime();
        reverseMethod(input);
        long endTime = System.nanoTime();
        long reverseTime = endTime - startTime;

        // Stack Method Timing
        startTime = System.nanoTime();
        stackMethod(input);
        endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque Method Timing
        startTime = System.nanoTime();
        dequeMethod(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Recursive Method Timing
        startTime = System.nanoTime();
        recursiveMethod(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;

        // Display Results
        System.out.println("Reverse Method Time   : " + reverseTime + " ns");
        System.out.println("Stack Method Time     : " + stackTime + " ns");
        System.out.println("Deque Method Time     : " + dequeTime + " ns");
        System.out.println("Recursive Method Time : " + recursiveTime + " ns");

        System.out.println("\n(Note: Results may vary per execution)");
    }
}