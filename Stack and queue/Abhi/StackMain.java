package Abhi;

public class StackMain {
    public static void main(String[] args) throws StackExeption {
        CustomStack stack = new CustomStack(5);
        stack.push(3); 
         stack.push(4); 
         stack.push(5); 
         stack.push(1); 
         stack.push(2);
         stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        
 

    }
}
