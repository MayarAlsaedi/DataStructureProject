/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytreep;

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
}
