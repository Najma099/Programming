class BinaryTree {
    Node root = null;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public void insert(int data) {
        this.root = insertRec(this.root, data);
    }

    private Node insertRec(Node curr, int data) {
        if (curr == null) {
            return new Node(data);
        }

        if (data < curr.data) {
            curr.left = insertRec(curr.left, data);
        } else if (data > curr.data) {
            curr.right = insertRec(curr.right, data);
        }

        return curr;
    }

    public void inorder() {
        this.print(this.root);
    }

    private void print(Node root) {
        if (root == null)
            return;

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public void delete(int val) {
        this.root = deleteRec(this.root, val);
    }

    private Node deleteRec(Node curr, int val) {
        if (curr == null) {
            return null;
        }

        if (val < curr.data) {
            curr.left = deleteRec(curr.left, val);
        } else if (val > curr.data) {
            curr.right = deleteRec(curr.right, val);
        } else {
            

            // Node has no children (leaf node)
            if (curr.left == null && curr.right == null) {
                return null;
            }
            // Node has only one child
            else if (curr.left == null) {
                return curr.right;
            } else if (curr.right == null) {
                return curr.left;
            }
            // Node has two children
            else {
               
                Node successor = findMin(curr.right);
                curr.data = successor.data;
                curr.right = deleteRec(curr.right, successor.data);
            }
        }

        return curr;
    }

    private Node findMin(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(4);
        tree.insert(8);
        tree.insert(11);
        tree.insert(13);
        tree.insert(44);
        tree.insert(7);
        tree.insert(18);
        tree.insert(55);
        tree.insert(2);

        System.out.println("Inorder traversal before deletion:");
        tree.inorder();
        System.out.println();

        tree.delete(11);

        System.out.println("Inorder traversal after deletion:");
        tree.inorder();
    }
}
