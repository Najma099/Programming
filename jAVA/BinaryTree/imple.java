public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
class BinaryTree {

    

  

    
}

public class Imple {
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        tree.initializeTree(nodes);
        BinaryTree.Node root = tree.getRoot();
        System.out.println(root.data);
    }
}
