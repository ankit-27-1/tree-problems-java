public class file6 {
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
    static void invert(Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            return;
        }
        else{
            Node val=root.left;
            root.left=root.right;
            root.right=val;
        }
        invert(root.left);
        invert(root.right);
    }
    static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        invert(root);
        preOrder(root);
        //1 2 4 5 3 6 7
    }
}
