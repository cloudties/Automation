package com.automation.ui.ipe.pageobjectsfactory.pageobject.deq.vo;


//https://stackoverflow.com/questions/19330731/tree-implementation-in-java-root-parents-and-children
public class TreeNode <T>
{
    private T value = null;
    private  TreeNode[] children = new  TreeNode[100];
    private int childCount = 0;
    public TreeNode(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public void setChildren( TreeNode[] children) {
        this.children = children;
    }
    public  TreeNode[] getChildren() {
        return children;
    }

    public  TreeNode addChild(T value) {
         TreeNode newChild = new  TreeNode(value);
        children[childCount++] = newChild;
        return newChild;
    }

    public void traverse( TreeNode obj) {
        if (obj != null) {
            for (int i = 0; i < obj.childCount; i++) {
                System.out.println(obj.children[i].value);
                traverse(obj.children[i]);
            }
        }
        return;
    }

    public void printTree( TreeNode obj) {
        System.out.println(obj.value);
        traverse(obj);
    }
}