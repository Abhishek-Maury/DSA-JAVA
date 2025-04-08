package Abhi;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class InBuildExample {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(3); 
        // stack.push(4); 
        // stack.push(5); 
        // stack.push(1); 
        // stack.push(2); 
        // stack.push(8); 

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(2);
        // queue.add(5);
        // queue.add(1);
        // queue.add(3);
        // System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(3);
        deque.addLast(6);
        System.out.println(deque.removeFirst());
    }
}