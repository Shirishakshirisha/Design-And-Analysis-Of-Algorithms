package Trees;

public class Main {
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.right.left = new Node(4);
        BinaryTree bt = new BinaryTree();
        bt.preorder(root);
        bt.postorder(root);
        bt.inorder(root);

    }

}
