/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstdansorting;

/**
 *
 * @author C I C I L I A
 */
public class BinaryTreeNode {
    Object element;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    public BinaryTreeNode(){}
    public BinaryTreeNode(Object theElement){
        element = theElement;
    }
    public BinaryTreeNode(Object theElement,BinaryTreeNode theleftChild,BinaryTreeNode therightChild){
        element = theElement;
        leftChild = theleftChild;
        rightChild = therightChild;
    }
    
}