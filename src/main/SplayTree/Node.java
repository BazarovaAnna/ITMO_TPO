package main.SplayTree;

public class Node {

    Node left, right, parent;
    int element;

    /** Constructor **/
    public Node()
    {
        this(0, null, null, null);
    }
    /** Constructor **/
    public Node(int ele)
    {
        this(ele, null, null, null);
    }
    /** Constructor **/
    public Node(int ele, Node left, Node right, Node parent)
    {
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.element = ele;
    }

}
