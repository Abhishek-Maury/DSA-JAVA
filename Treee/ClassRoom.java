import java.util.*;

public class ClassRoom {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static int height(Node root){
    // if (root==null) {
    // return 0;
    // }
    // int lh = height(root.left);
    // int rh = height(root.right);
    // return Math.max(lh, rh)+1;
    // }

    // public static int countNodes(Node root){
    // if (root==null) {
    // return 0;
    // }
    // int lc = countNodes(root.left);
    // int rc = countNodes(root.right);
    // return lc+rc+1;
    // }

    // public static int sumNodes(Node root){
    // if (root==null) {
    // return 0;
    // }
    // int lc = sumNodes(root.left);
    // int rc = sumNodes(root.right);
    // return lc+rc+root.data;
    // }

    // public static int diameter2(Node root){ //o(n^2)
    // if (root == null) {
    // return 0;
    // }
    // int ldiam = diameter2(root.left);
    // int rdiam = diameter2(root.right);
    // int lh = height(root.left);
    // int rh = height(root.right);

    // int selfDiam = lh+rh+1;
    // return Math.max( selfDiam,Math.max(rdiam, ldiam));
    // }

    // static class info{
    // int diam;
    // int ht;
    // public info(int diam, int ht) {
    // this.diam = diam;
    // this.ht = ht;
    // }

    // }

    // public static info diameter(Node root){
    // if (root==null) {
    // return new info(0, 0);
    // }

    // info leftInfo = diameter(root.left);
    // info rightInfo = diameter(root.right);

    // int finalDiam= Math.max(Math.max(leftInfo.diam,
    // rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
    // int finalHt= Math.max(leftInfo.ht, rightInfo.ht)+1;
    // return new info(finalDiam, finalHt);
    // }

    // public static boolean isIdentical(Node node, Node subroot){
    // if (node==null&&subroot==null) {
    // return true;
    // }
    // else if (node.data!= subroot.data || node==null || subroot ==null) {
    // return false;
    // }
    // if (!isIdentical(node.left, subroot.left)) {
    // return false;
    // }
    // if (!isIdentical(node.right, subroot.right)) {
    // return false;
    // }
    // return true;

    // }

    // public static boolean isSubtree(Node root,Node subroot){
    // if (root==null) {
    // return false;
    // }
    // else if (root.data==subroot.data) {
    // if (isIdentical(root,subroot)) {
    // return true;
    // }
    // }

    // return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    //
    // }

    static class Info {
        int hd;
        Node node;

        public Info(Node node, int hd) {
            this.hd = hd;
            this.node = node;
        }
    }

    public static void topView(Node root) {
        // Level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) { // First time occur int key
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void kLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean leftFound = getPath(root.left, n, path);
        boolean rightFound = getPath(root.right, n, path);

        if (leftFound || rightFound) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;

    }

    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        // last common ancesstor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;

    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }
        return root;
    }

    // /Minimum distance between nodes

    public static int dist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = dist(root.left, n);
        int rightDist = dist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }

    }

    public static int minDis(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int dist1 = dist(lca, n1);
        int dist2 = dist(lca, n2);

        return dist1 + dist2;

    }

    public static int kAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data==n) {
            return 0;
        }

        int lefdist= kAncestor(root.left, n, k);
        int righdist = kAncestor(root.right, n, k);

        if (lefdist==-1 && righdist==-1) {
            return -1;
        }
        int max = Math.max(lefdist, righdist);
        if (max+1==k) {
            System.out.println(root.data);
        }
        return max+1;

    }

    public static int transform(Node root){
        if (root==null) {
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild = transform(root.right);
        int data = root.data;
        int newLeft = root.left==null ? 0:root.left.data;
        int newRight = root.right==null ? 0:root.right.data;

        root.data =newLeft+leftChild+newRight+rightChild;
        return data;
    }

    public static void preorder(Node root){
        if ( root==null) {
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // int k =2;
        // kLevel(root, 1, k);

        // int n1 = 4, n2 = 5;
        // System.out.println(minDis(root, n1, n2));

        transform(root);
        preorder(root);

        // System.out.println(lca(root, n1, n2).data);
        // System.out.println(lca2(root, n1, n2).data);

        // Node subroot = new Node(2);
        // subroot.left=new Node(4);
        // subroot.right= new Node(5);

        // System.out.println(height(root));
        // System.out.println(countNodes(root));
        // System.out.println(sumNodes(root));
        // System.out.println(diameter(root));
        // System.out.println(diameter(root).ht);
        // System.out.println(isSubtree(root, subroot));
        // topView(root);

    }
}
