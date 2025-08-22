public class AVL {
    class Node {
        int data;
        Node left;
        Node right;
        int height;

        Node(int data) {
            this.data = data;
            this.height = 0;
        }
    }

    Node root = null;

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private Node insertRec(Node node, int val) {
        if (node == null)
            return new Node(val);

        if (node.data > val) {
            node.left = insertRec(node.left, val);
        } else if (node.data < val) {
            node.right = insertRec(node.right, val);
        } else {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int bf = getBalanceFactor(node);

        // Left-Left case
        if (bf > 1 && val < node.left.data) {
            return rightRotate(node);
        }

        // Left-Right case
        if (bf > 1 && val > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right-Right case
        if (bf < -1 && val > node.right.data) {
            return leftRotate(node);
        }

        // Right-Left case
        if (bf < -1 && val < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }
    

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
    
        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    private int getBalanceFactor(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    //method to print the tree (in-order traversal)
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.data + " ");
            inOrderRec(node.right);
        }
    }

    public static void main(String[] args) {
        AVL tree = new AVL();

        // Test insertions
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        // Print in-order traversal of the AVL tree
        tree.inOrder();
    }
}
