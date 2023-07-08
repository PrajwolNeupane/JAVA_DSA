import java.util.Stack;

public class ChocolateStack {

    public static int distributeChocolates(int[] sweetnessValues) {
        Stack<Integer> stack = new Stack<>();
        int totalSweetness = 0;

        // Push all chocolates onto the stack
        for (int sweetness : sweetnessValues) {
            stack.push(sweetness);
        }

        while (!stack.isEmpty()) {
            int currentSweetness = stack.pop();
            totalSweetness += currentSweetness;

            // Additional operations based on specific conditions
            // (e.g., pushing more chocolates onto the stack)

            // Perform other required operations

        }

        return totalSweetness;
    }

    public static void main(String[] args) {
        int[] sweetnessValues = { 3, 5, 2, 6, 1, 4 };

        int totalSweetness = distributeChocolates(sweetnessValues);
        System.out.println("Total sweetness: " + totalSweetness);
    }
}
