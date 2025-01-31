/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytreep;
import java.util.Arrays;
/**
 *
 * @author mayaralsaedi
 */
public class BinaryTreeP<E> {

    private E[] tree;       // Array to store the nodes
    private int size;       // Current number of elements in the tree
    private int capacity;   // Maximum capacity of the tree

    // Constructor to initialize the binary tree with a default capacity
    public BinaryTreeP(int capacity) {
        this.capacity = capacity;
        this.tree = (E[]) new Object[capacity]; // Create a generic array
        this.size = 0; // Initially, the tree is empty
    }

    // Getter for the size of the tree
    public int getSize() {
        return size;
    }

    // Getter for the capacity of the tree
    public int getCapacity() {
        return capacity;
    }

    // Method to check if the tree is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the tree is full
    public boolean isFull() {
        return size == capacity;
    } 
    
    // Method to get the parent of the node 
    public E getParent(int i) {
      if (i <= 0 || i >= size) {
          return null;//  invalid index (out of bounds) }
          } else { 
          return tree[(i - 1) / 2]; // Parent node is at index (i - 1) / 2 } 
      }}

    // Method to get the left child of the node at index i
    public E getLeftChild(int i) {
        int leftIndex = 2 * i + 1;
        if (leftIndex >= size) {
            return null; // No left child exists
        }
        return tree[leftIndex];
    }

    // Method to get the right child of the node at index i
    public E getRightChild(int i) {
        int rightIndex = 2 * i + 2;
        if (rightIndex >= size) {
            return null; // No right child exists
        }
        return tree[rightIndex];
    }

    // in-order traversal
    public void InOrdertraversal(int index) {
        if(index >= size || tree[index]== null) return;
        InOrdertraversal(2* index +1);
        System.out.print(tree[index]+ " ");
        InOrdertraversal(2* index +2);
    }
    
    // post-order traversal
    public void PostOrdertraversal(int index) {
	if (index >= size || tree[index] == null) return; 
       PostOrdertraversal(2 * index + 1); 
       PostOrdertraversal(2 * index + 2);
       System.out.print(tree[index]+ " ");
    }
    
    // pre-order traversal
    public void PreOrdertraversal(int index) {
       if (index >= size || tree[index] == null) return;
       System.out.print(tree[index]+ " "); 
       PreOrdertraversal(2 * index + 1); 
       PreOrdertraversal(2 * index + 2);
    }

    // Method to dynamically resize the array when the tree exceeds its capacity
    private void resize() {
        int newCapacity = capacity * 2; // Double the capacity
        E[] newTree = (E[]) new Object[newCapacity]; // Create a new array

        // Copy elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            newTree[i] = tree[i];
        }

        tree = newTree; // Update the tree reference
        capacity = newCapacity; // Update the capacity
    }

    // Method to insert a new element into the tree
    public void insert(E element) {
        if (isFull()) {
            resize(); // Resize the array if the tree is full
        }
        tree[size] = element; // Insert the new element
        size++; // Increment the size
    }

    // Method to safely access an element at a specific index
    public E safeAccess(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return tree[index];
    }
}
