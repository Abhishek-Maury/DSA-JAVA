public class BSTCLASSROOM {

    static class Node{
        int data;
        Node left;
        Node right;
         Node(int data) {
            this.data= data;
        }
        
    }

    public static Node mirror(Node root){
        if (root==null) {
            return null;         
        }
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);

        root.right=leftS;
        root.left=rightS;
        return root;
    }

   public static void preorder(Node root){
    if (root==null) {
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);
   }

   public static Node createBst(int []arr,int st ,int end){
    if (st>end) {
        return null;
    }
    int mid = (st+end)/2;
    Node root = new Node(arr[mid]);
     root.left = createBst(arr, st, mid-1);
     root.right = createBst(arr, mid+1, end);

    return root;
   }
    public static void main(String[] args) {
        /*
                     MIRROR
                 
            8            |          8
         /    \          |        /   \
        5      10        |      10     5
       /  \     \        |      /     /   \
      3    6      11     |    11     6     3   
          

              
          
         */

        //  Node root = new Node(8);
        //  root.left=new Node(5);
        //  root.right =new Node(10);
        //  root.left.left = new Node(3);
        //  root.left.right=new Node(6);
        //  root.right.right=new Node(11);
        //  preorder(root);
        //  mirror(root);
        //  System.out.println();
        //  preorder(root);
        int [] arr ={3,5,6,8,10,11,12};
        Node root =createBst(arr, 0, arr.length-1);
        preorder(root);
        
    }
}
