package com.bridgelabz;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	public MyBinaryNode<K> left;
	public MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = left;
		this.right = right;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

}