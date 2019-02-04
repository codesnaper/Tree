package com.tree.traversal;

public class Tree {
public static Node root;

public void insert(int key){
	if(root == null){
		root = insertUtil(null, key);
		System.out.println("Root Node inserted : "+insertUtil(null, key).toString());
	}
	else
		System.out.println("Node inserted : "+insertUtil(root, key).toString());
}

Node insertUtil(Node node,int key){
	if(node == null){
		node = new Node(key,key);
	}
	if(node.key>key){
	
		node.left=insertUtil(node.left, key);
	}
	if(node.key<key){
		
		node.right=insertUtil(node.right, key);
	}
	return node;
}

public void inorderTravel(Node node){
	if(node == null){
		return;
	}
	inorderTravel(node.left);
	System.out.print(node.key+",");
	inorderTravel(node.right);
}

public void postorderTravel(Node node){
	if(node == null)
		return;
	postorderTravel(node.left);
	postorderTravel(node.right);
	System.out.print(node.key+",");
}

public void preOrderTravel(Node node){
	if(node == null){
		return;
	}
	System.out.print(node.key+",");
	preOrderTravel(node.left);
	preOrderTravel(node.right);
}

Node search(Node node,int key) {
	if(node ==null){
		return null;
	}	
	else{
		if(node.key==key){			
			return node;
		}
		else{
		if(node.key<key)
			return search(node.right, key);
		else
			return search(node.left, key);
		}

	}
	
	
}

Node deleteNode(Node node, int key){
	if(node.key==key){
		
	}
	else{
		
	}
}

public static void main(String[] args) throws Exception {
	Tree tree = new Tree();
	tree.insert(50);
	tree.insert(30);
	tree.insert(70);
	tree.insert(40);
	tree.insert(60);
	tree.insert(80);
//	tree.inorderTravel(root);
//	System.out.println();
//	tree.postorderTravel(root);
//	System.out.println();
//	tree.preOrderTravel(root);
	
	System.out.println("Node found is :"+ tree.search(root, 90).toString());
	
	
	
}
}
