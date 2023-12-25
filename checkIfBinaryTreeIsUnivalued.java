import java.util.ArrayList;
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
    static ArrayList<Boolean> list=new ArrayList<>();
    static void uniValued(Node root,int n){
        if(root==null){
            return;
        }
        list.add(n==root.data);
        uniValued(root.left,n);
        uniValued(root.right,n);
    }
    public static void main(String[] args) {
        Node root=new Node(2);
        root.right=new Node(2);
        root.left=new Node(2);
        root.left.left=new Node(5);
        root.left.right=new Node(2);
        int n=root.data;
        uniValued(root,n);
        boolean ans=true;
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=ans){
                System.out.println("False");
                ans=false;
                break;
            }
        }
        if(ans==true){
            System.out.println("True");
        }
    }
}
