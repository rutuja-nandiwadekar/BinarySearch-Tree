/*
 *Ability to search 63 in the Binary Tree Implement Search method and 
 *recursively search left or right nodes to find 63
 */
package com.bridgelabz;

public class MyBinaryTreeMain {

	public static void main(String[] args) {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int size = myBinaryTree.getSize();
		System.out.println("Size : " + size);

		Integer result = myBinaryTree.searchKey(56);

		if (result == 1)
			System.out.println("key found");
		else
			System.out.println("key not found");
	}
}
