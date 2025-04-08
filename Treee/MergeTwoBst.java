import java.util.ArrayList;

public class MergeTwoBst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void getInorder(ArrayList<Integer> arr,Node root){
        if (root==null) {
            return;
        }
        getInorder(arr, root.left);
        arr.add(root.data);
        getInorder(arr, root.right);

    }
    public static Node createBst(ArrayList<Integer> arr,int st,int end){
        if (st>end) {
            return null;
        }
        int mid =(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBst(arr, st, mid-1);
        root.right=createBst(arr, mid+1, end);
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

    public static Node mergeBst(Node root1,Node root2){
        //step1
        ArrayList<Integer> arr1= new ArrayList<>();
        getInorder(arr1,root1);
        //step2
        ArrayList<Integer> arr2= new ArrayList<>();
        getInorder(arr2,root2);

        //step3 merge
        ArrayList<Integer> finalArr= new ArrayList<>();
        int i=0;
        int j=0;
        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i<arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            finalArr.add(arr2.get(j));
                j++;
        }
        //step4 balanced bst
     return  createBst(finalArr, 0, finalArr.size()-1);

    }
    public static void main(String[] args) {
        Node root1 =new Node(2);
        root1.left =new Node(1);
        root1.right=new Node(4);

        Node root2 =new Node(9);
        root2.left =new Node(3);
        root2.right=new Node(12);

        Node root = mergeBst(root1, root2);
        preorder(root);

    }
}
