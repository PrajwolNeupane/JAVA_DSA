import java.util.ArrayList;

public class MainTwo {

    static class Stack {
        private ArrayList<Integer> list;

        public Stack() {
            list = new ArrayList<>();
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1; // Return a specific value to indicate stack underflow
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1; // Return a specific value to indicate an empty stack
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
