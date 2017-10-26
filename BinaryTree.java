package com.company;

import java.util.Comparator;

/**
 * Created by owotu on 2017-10-24.
 */
public class BinaryTree implements Comparator{

    public class Node{
        Node left;
        Node right;
        Node parent;
        Object value;
        public Node(Node left, Node right, Node parent, Object value){
            this.left = left;
            this.right = right;
            this.parent = parent;
            this.value = value;
        }
    }

    Node root;
    int elems;

    public BinaryTree(){
        this.root = null;
        this.elems = 1;
    }

    public void addNode(Object value) {
        this.root = addNode(root,value,null);
    }

    public Node addNode(Node node, Object value,Node parent){
        if (node == null){
            node = new Node(null,null,parent,value);
        }

        else if(compare(node.value,value) < 0){
            node.right = addNode(node.right,value,node);
        }

        else if (compare(node.value,value) > 0){
            node.left = addNode(node.left,value,node);
        }

        return node;
    }

    public Node removeNode(Object value){
        return null;
    }
    //I only want String and Integer values in my Binary search tree
    @Override
    public int compare(Object o1, Object o2) {
        int a = 0;
        if (o1 instanceof String){
            return ((String) o1).compareTo((String) o2);
        }
        else if (o1 instanceof Integer){
            if ((Integer) o1 < (Integer) o2){
                a = -1;
            }

            else if((Integer) o1 == (Integer) o2){
                a = 0;
            }

            else{
                a = 1;
            }
        }

        return a;
    }


}
