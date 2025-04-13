public class Linked {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step 1 create a node
        Node newNode = new Node(data);
        size++;
        if (head==null) {
           head=tail=newNode;
           return; 
        }
        // step 2 newNodeNext=head
        newNode.next=head;
        // step 3
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int idx,int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
    }

    public int removeFirst(){
        if (size==0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size==0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        int val=prev.next.data; //tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    
    public void print(){
        if (head==null) {
            System.out.println("Linklist is Empty");
            return;
        }
        Node temp =head;
        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int iterSearch(int key){
        Node temp = head;
        int i=0;
        while (temp!=null) {
            if (temp.data==key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if (head==null) {
            return -1;
        }
        if (head.data==key) {
            return 0;
        }
        int idx =helper(head.next, key);
        if (idx==-1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
      return helper(head, key);
    }

  // Q1 ->Reverse the Linked List
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
  // Q2->Remove nth Node from end

    public void removeNthNodeFromEnd(int n){
        int sz=0;
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
            sz++;
        }

        if (n==sz) {
            head=head.next;
            return;
        }
        int i=1;
        int itofind = sz-n;
        Node prev=head;
        while (i<itofind) {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

  // Q3 check if LL is palindrome

     // fast and slow pointer to find the mid
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null) {
            slow=slow.next; //+1
            fast=fast.next.next;//+2
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if (head==null || head.next==null) {
            return true;
        }
        // step 1->find mid
         Node midNode=findMid(head);

        // step 2->reverse the 2nd half
          Node prev=null;
          Node curr=midNode;
          Node next;

          while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
          }
          Node right=prev;
          Node left=head;
        // step 3->check left and right
        while (right!=null) {
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

// Q4 Detecting a cycle/loop

public static boolean isCycle(){
    Node slow=head;
    Node fast=head;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            return true;
        }
    }
    return false;
}

// Q5 Removed a Cycle/loop

  public static void removeCycle(){
    // step 1 -> detect a cycle
    Node slow = head;
    Node fast=head;
    boolean cycle =false;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            cycle=true;
            break;
        }
    }
    if (cycle==false) {
        return;
    }

    // step 2->
    slow=head;
    Node prev = null;
    while (slow!=fast) {
        prev=fast; //last node
        slow=slow.next;
        fast=fast.next;
    }

    // step3
    prev.next=null;
  }

  private Node getMide(Node head){
    Node slow =head;
    Node fast=head.next;

    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next;
    }
    return slow;
  }

  private Node merge(Node head1,Node head2){
    Node mergell=new Node(-1);
    Node temp=mergell;

    while (head1!=null && head2!=null) {
        if (head1.data<=head2.data) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }
    while (head1!=null) {
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
    }
    while (head2!=null) {
        temp.next=head2;
            head2=head2.next;
            temp=temp.next;
    }
    return mergell.next;
  }

  public Node mergeSort(Node head){
    if (head==null || head.next==null) {
        return head;
    }
    // step->1
    Node mid=getMide(head);

   // step->2
   Node rightHead=mid.next;
   mid.next=null;
   Node lefthalf=mergeSort(head);
   Node rightHalf=mergeSort(rightHead);

   return merge(lefthalf,rightHalf);
  }

    public static void main(String[] args) {
          Linked ll = new Linked();
          ll.addFirst(4);
          ll.addFirst(5);
          ll.addLast(3);
          ll.addLast(2);
          ll.addLast(1);
          ll.print();
          ll.head=ll.mergeSort(ll.head);
          ll.print();
        // //   ll.add(2, 3);

        // //   ll.print();
        // //   System.out.println(ll.removeLast());

        //   ll.print();
        // //   ll.reverse();
        // // ll.removeNthNodeFromEnd(3);         
        // //   System.out.println(ll.size);
        // // System.out.println(ll.recSearch(3));
        // // System.out.println(ll.iterSearch(10));
        // // ll.print();
        // System.out.println(ll.checkPalindrome());
        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());
    }
}