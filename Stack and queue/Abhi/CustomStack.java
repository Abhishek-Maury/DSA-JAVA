package Abhi;

public class CustomStack {
    protected int [] data;
    private static final int DEFAULT_SIZE=10;
    int ptr =-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data=new int[size];
    }
//    for insert an item.
    public boolean push(int item){
        if (isfull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
//    for delete an item.
    public int pop() throws StackExeption{
        if (isEmpty()) {
            throw new StackExeption("Cannot pop from an empty stack");
        }
        int remove = data[ptr];
        ptr--;
        return remove;

    }
//    for peek an element.
    public int peek() throws StackExeption{
        if (isEmpty()) {
            throw new StackExeption("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isfull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }
    
}
