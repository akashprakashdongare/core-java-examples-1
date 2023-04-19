/**
 * 
 */
package com.main.algorithams;

/**
 * @author Akash.d
 *
 */

class Node {
	int data;
	Node left;
	Node right;
}

class BST {

	public Node insertDat(Node node, int val) {

		if (node == null)
			return createNewNode(val);

		if (val < node.data)
			node.left = insertDat(node.left, val);
		else if (val > node.data)
			node.right = insertDat(node.right, val);

		return node;
	}

	private Node createNewNode(int val) {
		Node n = new Node();
		n.data = val;
		n.left = null;
		n.right = null;
		return n;
	}

	public boolean contains(Node root, int value) {
		if (root.data == value)
			return true;

		if (root.data > value)
			return contains(root.left, value);

		if (root.data < value)
			return contains(root.right, value);

		return false;
	}

}

public class BinarySearchTree {
	public static void main(String[] args) {
		BST a = new BST();
		Node root = null;
		root = a.insertDat(root, 8);
		root = a.insertDat(root, 3);
		root = a.insertDat(root, 6);
		root = a.insertDat(root, 10);
		root = a.insertDat(root, 4);
		root = a.insertDat(root, 7);
		root = a.insertDat(root, 1);
		root = a.insertDat(root, 14);
		root = a.insertDat(root, 13);

		System.out.println(a.contains(root, 11));
	}

}
