package algos;

/**
 * Created by waqar on 2/5/2018.
 */

class BNode{
    int key;
    BNode left;
    BNode right;

    public BNode(int key){
        this.key = key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(BNode left) {
        this.left = left;
    }

    public BNode getLeft() {
        return left;
    }

    public void setRight(BNode right) {
        this.right = right;
    }

    public BNode getRight() {
        return right;
    }
}

public class BinarySearchTree {

    BNode root = null;

    public void add(int key){
        BNode node = new BNode(key);

        if(root == null){
            root = node;
        }
        else{
            BNode current = root;

            while(true){
                // if left or right child is null, then we lost the node therefore we keep a copy here.
                BNode parent = current;
                if(key < current.getKey()){
                    current = current.getLeft();

                    if(current == null){
                        parent.setLeft(node);
                        return;
                    }
                }
                else{
                    current = current.getRight();

                    if (current == null){
                        parent.setRight(node);
                        return;
                    }
                }
            }
        }
    }

    public BNode getRootNode(){
        return root;
    }

    public void inOrderTraverse(BNode node){

        if(node != null){
            inOrderTraverse(node.getLeft());
            System.out.print(node.getKey() + " ");
            inOrderTraverse(node.getRight());
        }
    }

    public void postOrderTraverse(BNode node){

        if(node != null){
            postOrderTraverse(node.getLeft());
            postOrderTraverse(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }

    public void preOrderTraverse(BNode node){

        if(node != null){
            System.out.print(node.getKey() + " ");
            preOrderTraverse(node.getLeft());
            preOrderTraverse(node.getRight());
        }
    }

    public Integer findNode(int key){
        BNode current = root;

        while(current.getKey() != key){
            if(key < current.getKey())
                current = current.getLeft();
            else
                current = current.getRight();
            if(current == null)
                return null;
        }
        return current.getKey();
    }

    public boolean isBST(){
        // All values in left sub tree should be less than root key, and in right sub tree
        // should be greater than root key. Therefore, we make a comparison using this value.
        return isBST(root, root.getKey());
    }

    private boolean isBST(BNode root, int val) {
        BNode current = root;
        if(current == null) return true;

        if(root.getLeft() == null || current.getRight() == null) return true;

        // if BST invariat is false for any root, then return false;
        if( root.getKey() < root.getLeft().getKey()|| root.getKey() > val) return false;

        if(root.getKey() > root.getRight().getKey() || root.getKey() < val) return false;

        return isBST(root.getLeft(), root.getKey()) && isBST(root.getRight(), root.getKey());

    }

    public int height(BNode node){
        if(node == null) return 0;

        return 1 + Math.max(height(node.getLeft()),  height(node.getRight()));
    }


    public static void main(String args[]){
        BinarySearchTree bt = new BinarySearchTree();
        bt.add(50);
        bt.add(25);
        bt.add(15);
        bt.add(30);
        bt.add(75);
        bt.add(85);

        System.out.println(bt.height(bt.getRootNode()));
        bt.inOrderTraverse(bt.getRootNode());
        System.out.println();
        bt.preOrderTraverse(bt.getRootNode());
        System.out.println();
        bt.postOrderTraverse(bt.getRootNode());
        System.out.println();
        //System.out.println(bt.isBST());

        BinarySearchTree bt1 = new BinarySearchTree();
        bt1.root = new BNode(3);
        bt1.root.setLeft(new BNode(2));
        bt1.root.setRight(new BNode(5));
        bt1.root.getLeft().setLeft(new BNode(1));
        bt1.root.getLeft().setRight(new BNode(4));

        System.out.println(bt1.isBST());


    }

}
