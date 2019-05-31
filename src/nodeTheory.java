//
//class Node {
//    int key;
//    Node parent, left, right;
//
//    //constructor
//    Node(int key, Node parent) {
//        this.key = key;
//        this.parent = parent;
//        left = right = null;
//    }
//
//    //method gets the height of a node tree
//    int getHeight(){
//        if(left==null && right==null) return 1;
//        int leftH = left.getHeight() + 1;
//        int rightH = right.getHeight() + 1;
//
//        return Math.max(leftH,rightH);
//    }
//}
//
//public class nodeTheory {
//    private static Node root;
//
//    //Inorder Traversal
//    private static void printInorder(Node node){
//        if(node==null) return; //if the node doesn't have any child nodes, return.
//
//        printInorder(node.left);
//        System.out.println(node.key + " ");
//        printInorder(node.right);
//    }
//
//    public static void main(String[] args){
//        root = new Node(33,null);
//        root.left = new Node(29,root);
//        root.right = new Node(35,root);
//        root.left.left = new Node(18,root.left);
//        root.right.left = new Node(34,root.right);
//        root.right.right = new Node(42,root.right);
//        printInorder(root);
//    }
//}

