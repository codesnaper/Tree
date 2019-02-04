package com.tree.traversal;


public class Node{
	int key;
	int data;
	Node left,right,parent;
	public Node(int key, int data) {
		super();
		this.key = key;
		this.data = data;
		this.left = this.right = this.parent = null;
	}
	@Override
	public String toString() {
		return "Node [key=" + key + ", data=" + data + ", left=" + left
				+ ", right=" + right + ", parent=" + parent + "]";
	}
	
	
}