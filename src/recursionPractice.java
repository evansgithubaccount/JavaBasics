class Node{
    Node left,right;
    Node parent;
    int key;

    Node(int key,Node parent){
        this.key = key;
        this.parent = parent;
        left = right = null;
    }
}

public class recursionPractice {
    private static Node root;

    private static int getBiggestNode(Node node){
        if(node==null) return 0;

        int rValue = getBiggestNode(node.right);
        int lValue = getBiggestNode(node.left);

        if(rValue>node.key && rValue>lValue) return rValue;
        else if(lValue>node.key && lValue>rValue) return lValue;
        else return node.key;
    }

    public static void main(String[] args){
        root = new Node(15,null);
        root.right =  new Node( 18,root);
        root.left = new Node(12,root);
        root.right.left = new Node(16,root.right);
        root.right.right = new Node(25,root.right);
        root.left.left = new Node(2,root.left);

        System.out.println(getBiggestNode(root));
    }

}
