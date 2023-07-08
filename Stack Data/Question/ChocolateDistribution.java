import java.util.Stack;

public class ChocolateDistribution {

    public static int distributeChocolates(int[] chocolates, int numStudents) {
        Stack<Integer> stack = new Stack<>();

        // Push all chocolates onto the stack
        for (int i = 0; i < chocolates.length; i++) {
            stack.push(chocolates[i]);
        }

        // Sort the stack in ascending order
        stack.sort(null);

        int minDifference = Integer.MAX_VALUE;

        // Distribute chocolates to students
        while (stack.size() >= numStudents) {
            int maxChocolates = stack.pop();
            int minChocolates = stack.get(stack.size() - numStudents);

            int difference = maxChocolates - minChocolates;
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }

    public static void main(String[] args) {
        int[] chocolates = { 3, 4, 1, 9, 5, 6 };
        int numStudents = 3;

        int minDifference = distributeChocolates(chocolates, numStudents);
        System.out.println("Minimum difference: " + minDifference);
    }
}
