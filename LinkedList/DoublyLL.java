public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;


    // add
    public void addfirst(int data) {
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    // removeFirst

    public int removeFirst(){
        if (head==null) {
            System.out.println("Dll is Empty");
            return Integer.MIN_VALUE;
        }
       int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }

    // print
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // reverse

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next; 

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // remove
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addfirst(4);
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();     
        dll.reverse();
        // System.out.println(dll.size); 
        // dll.removeFirst();   
        dll.print();
        System.out.println(dll.size);                  
    }
}
