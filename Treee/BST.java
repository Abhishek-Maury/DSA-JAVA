import java.util.*;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if (root==null) {
            return false;
        }
        if (root.data==key) {
            return true;
        }
        if (root.data>key) {
          return  search(root.left, key);
        }else{
           return search(root.right, key);
        }
    }

    public static Node delete(Node root,int val){
       if (root.data<val) {
        root.right=delete(root.right, val);
       }
       else if(root.data>val){
        root.left=delete(root.left, val);
       }else{
        // case1:leaf node
        if (root.right==null && root.left==null) {
            return null;
        }
        // case2:One child
        if (root.right==null) {
            return root.left;
        }
       else if (root.left==null) {
            return root.right;
        }

        // case3:Two child
        Node IS= findInorderSucessor(root.right);
        root.data= IS.data;
       root.right= delete(root.right, IS.data);
       }
       return root;
    }
    public static Node findInorderSucessor(Node root){
     while (root.left!=null) {
        root = root.left;
     }
     return root;
    }

    public static void printInRange(Node root,int k1,int k2){
        if (root==null) {
            return;
        }
        if (k1<=root.data && k2>=root.data) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
         else if(root.data>k2){
            printInRange(root.right, k1, k2);
         }else{
            printInRange(root.left, k1, k2);
         }
    }


    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("NULL");
    }
    public static void root2LeafPath(Node root,ArrayList<Integer> path){
        if (root==null) {
            return;
        }
        path.add(root.data);
        if (root.left==null && root.right==null) {
            printPath(path);
        }
        root2LeafPath(root.left, path);
        root2LeafPath(root.right, path);
        path.remove(path.size()-1);

    }

    public static boolean isValidBst(Node root,Node min,Node max){
        if (root==null) {
            return true;       
        }

        if (min!=null && root.data<=min.data) {
            return false;
        }else if(max!=null && root.data>=max.data){
            return false;
        }else{
            return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
        }
    }

    public static Node mirror(Node root){
        if (root ==null) {
            return null;
        }
       Node leftS = mirror(root.left);
       Node rightS = mirror(root.right);

       root.right=leftS;
       root.left=rightS;
       return root;
    }

    public static void main(String[] args) {
        int[] values = { 8,5,3,1,4,6,10,11,14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        // inorder(root);
        // root = delete(root,5 );
        // System.out.println();
        // inorder(root);
        // printInRange(root, 5, 12);

        // root2LeafPath(root, new ArrayList<>());
        if (isValidBst(root, null, null)) {
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }

        // if (search(root, 8)) {
        //     System.out.println("found");
        // }else{
        //     System.out.println("not found");
        // }
    }
}
