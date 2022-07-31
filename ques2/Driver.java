package ques2;

import ques2.Business.Node;

public class Driver {

	public static void main(String[] args) {

	          
	    	Business tree = new Business();  
	    	tree.root = new Node(50);  
	    	tree.root.left = new Node(30);  
	    	tree.root.right = new Node(60);  
	    	tree.root.left.left = new Node(10);  
	    	tree.root.left.right = new Node(55);  
	      Node bst = tree.Business(tree.root);          
	        tree.inorderTraversal(bst);  
	      
	}

}
