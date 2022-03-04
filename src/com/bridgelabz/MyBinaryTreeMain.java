/*
 *Ability to create a BST by adding 56 and then adding 30 & 70 
 *First add 56 as root node so 30 will be added to left and 70 to right
 */
package com.bridgelabz;

public class MyBinaryTreeMain {

	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		System.out.println("size = " + size);
	}
}
