

// Updated implementation taught by prof.Deepak Sir
class Node {
    int data;
    Node left;
    Node right;
    int height;
    int balance;

    Node(int data, int height) {
        this.data = data;
        this.height = 0;
    }
}

class AVL {

    Node root = null;

    public boolean find(int value) {
        return contains(root, value);
    }

    private static boolean contains(Node root, int value) {

        if (root == null)
            return false;
        else if (value > root.data)
            return contains(root.right, value);
        else if (value < root.data)
            return contains(root.left, value);
        else
            return true;
    }

    public boolean insert(int value) {
        if (this.find(value))
            return false;
        else {
            insertR(root, value);
            return true;
        }
    }

    private static Node insertR(Node root, int value) {

        if (root == null)
            return new Node(value, 0);

        else if (value > root.data)
            root.right = insertR(root.right, value);
        else
            root.left = insertR(root.left, value);

        update(root);
        return balanced(root);

    }

    private static void update(Node root) {
        int leftH = -1;
        int rightH = -1;

        if (root.left != null) {
            leftH = root.left.height;
        }

        if (root.right != null) {
            rightH = root.right.height;
        }

        root.height = 1 + Math.max(leftH, rightH);
        root.balance = leftH - rightH;
    }

    private static Node balanced(Node root) {
        if (root.balance == -2) {
            if (root.right.balance <= 0) {
                return leftrotation(root);
            } else {
                root.right = rightrotation(root.right);
                return rightrotation(root);
            }
        } else if (root.balance == 2) {
            if (root.left.balance >= 0)
                return rightrotation(root);
            else {
                root.left = leftrotation(root.left);
                return rightrotation(root);
            }
        }

        return root;
    }

    private static Node leftrotation(Node root) {
        Node B = root.right;
        root.right = B.left;
        B.left = root;

        update(root);
        update(B);
        return B;
    }

    private static Node rightrotation(Node root) {
        Node B = root.left;
        root.left = B.right;
        B.right = root;

        update(root);
        update(B);
        return B;
    }

    public boolean remove(int value) {
        if (this.find(value) == false) {
            return false;
        }
        this.root = delete(root, value);
        return true;
    }

    static Node delete(Node root, int value) {
        
        
        if (root.data > value)
            root.left = delete(root.left, value);
        else if (root.data < value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node curr = root;
                curr = curr.right;
                while (curr.left != null) {
                    curr = curr.right;
                }
                root.data = curr.data;
                root.right = delete(root.right, curr.data);
                update(root);
                return balanced(root);
            }
        }
        update(root);
        return balanced(root);
    }

    public void Inorder() {
        InorderR(root);
    }

    private void InorderR(Node root) {
        if (root == null) 
            return;
        InorderR(root.left);
        System.out.print(root.data + " ");
        InorderR(root.right);  
    }

    public void Preorder() {
        PreorderR(this.root);
    }

    private void PreorderR(Node root) {
        if(root == null)
            return ;
        System.out.print(root.data + " ");
        PreorderR(root.left);
        PreorderR(root.right);
    }

    public void Postorder() {
        PostorderR(root);
    }

    private void PostorderR(Node root) {
        if(root == null)
            return;
        PostorderR(root.left);
        PostorderR(root.right);
        System.out.print(root.data + " ");
    }

}

public class imple {
    public static void main(String[] args) {
        AVL avl = new AVL();
        avl.insert(3);
        avl.insert(8);
        avl.insert(5);
       
        avl.Preorder();
    }
}
