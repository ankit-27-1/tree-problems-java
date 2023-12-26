public class file7 {
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
    static Node deleteLeaf(Node root,int n){
        if(root==null){
            return null;
        }
        root.left=deleteLeaf(root.left,n);
        root.right=deleteLeaf(root.right,n);
        if(root.left==null && root.right==null && root.data==n){
                return null;
        }
        return root;
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[]args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(3);
        root.left.left=new Node(3);
        root.left.right=new Node(2);
        deleteLeaf(root,3);
        preOrder(root);
    }
}
