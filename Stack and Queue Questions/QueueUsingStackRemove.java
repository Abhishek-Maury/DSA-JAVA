import java.util.Stack;

public class QueueUsingStackRemove {
     private Stack<Integer> first;
  private Stack<Integer> secound;
public QueueUsingStackRemove() {
     first=new Stack<>();
     secound=new Stack<>();
}

public void add(int item ) throws Exception{
    while (!first.isEmpty()) {
        secound.push(first.pop());
    }
    first.push(item);

     while (!secound.isEmpty()) {
        first.push(secound.pop());
     }
     
    

}
public int remove() throws Exception{
   return first.pop();
}

public int peek() throws Exception {
   
return first.peek();
    
}

public boolean isEmpty(){
    return first.empty();
}
}
