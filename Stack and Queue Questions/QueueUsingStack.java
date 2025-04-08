import java.util.Stack;

 class QueueUsingStack{
  private Stack<Integer> first;
  private Stack<Integer> secound;
public QueueUsingStack() {
     first=new Stack<>();
     secound=new Stack<>();
}

public void add(int item ){
     first.push(item);
}
public int remove() throws Exception{
    while (!first.empty()) {
        secound.push(first.pop());
    }
   int removed = secound.pop();
   while (!secound.empty()) {
    first.push(secound.pop());
}
return removed;
}

public int peek() throws Exception {
    while (!first.empty()) {
        secound.push(first.pop());
    }
   int peeked = secound.peek();
   while (!secound.empty()) {
    first.push(secound.pop());
}
return peeked;
    
}

public boolean isEmpty(){
    return first.empty();
}

}
