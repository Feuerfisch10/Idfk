package SearchAndSortAlgorithms;

import java.util.Arrays;
import java.util.List;

import tools.tree.PrintableTreeNode;


public class BinaryTreeNode implements PrintableTreeNode {

    private int value;
    private BinaryTreeNode left;
    private BinaryTreeNode right;


    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
    @Override
    public String getText() {
        return "" + value;
    }
    @Override
    public List<BinaryTreeNode> getChildren() {
        return Arrays.asList(left, right);
    }
}
