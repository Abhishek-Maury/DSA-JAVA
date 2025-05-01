import java.util.*;

public class ImplementQAndSUsingDeque {
    static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        public static void push(int data) {
            deque.addLast(data);
        }

        public static int pop() {
            return deque.removeLast();
        }

        public static int peek() {
            return deque.getLast();
        }
    }

  static class Queue {
        static Deque<Integer> deque2 = new LinkedList<>();

        public static void push(int data) {
            deque2.addLast(data);
        }

        public static int pop() {
            return deque2.removeFirst();
        }

        public static int peek() {
            return deque2.getFirst();
        }

    }

    public static void main(String[] args) {

    }

}
