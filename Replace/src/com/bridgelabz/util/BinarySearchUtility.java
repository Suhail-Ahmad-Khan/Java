package com.bridgelabz.util;

class Node {
	int data;
	Node leftNode;
	Node rightNode;

	public Node(int data) {
		this.data = data;
		leftNode = null;
		rightNode = null;
	}
}

public class BinarySearchUtility {
	
	public Node root;	

	public BinarySearchUtility() {
		this.root = null;
	}

	public boolean Search(int data) {
		Node current = root;
		while (current != null) {
			if (current.data == data) {
				return true;
			} else if (current.data > data) {
				current = current.leftNode;
			} else {
				current = current.rightNode;
			}
		}
		return false;
	}

	public void Insert(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (data < current.data) {
				current = current.leftNode;
				if (current == null) {
					parent.leftNode = newNode;
					return;
				}
			} else {
				current = current.rightNode;
				if (current == null) {
					parent.rightNode = newNode;
					return;
				}
			}
		}
	}

	public void Display(Node root) {
		if (root != null) {
			Display(root.leftNode);
			System.out.print(" " + root.data);
			Display(root.rightNode);
		}
	}

	public long Count(int count) {
		long catalan, a = 1, b = 1, c = 1;
		for (int i = 1; i <= (2 * count); i++)
			a = a * i;
		System.out.println(a);
		for (int i = 1; i <= (count + 1); i++)
			b = b * i;
		System.out.println(b);
		for (int i = 1; i <= count; i++)
			c = c * i;
		System.out.println(c);

		catalan = a / (b * c);
		return catalan;
	}

	public boolean Delete(int data) {
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while (current.data != data) {
			parent = current;
			if (current.data > data) {
				isLeftChild = true;
				current = current.leftNode;
			} else {
				isLeftChild = false;
				current = current.rightNode;
			}
			if (current == null) {
				return false;
			}
		}
		// if i am here that means we have found the node
		// Case 1: if node to be deleted has no children
		if (current.leftNode == null && current.rightNode == null) {
			if (current == root) {
				root = null;
			}
			if (isLeftChild == true) {
				parent.leftNode = null;
			} else {
				parent.rightNode = null;
			}
		}
		// Case 2 : if node to be deleted has only one child
		else if (current.rightNode == null) {
			if (current == root) {
				root = current.leftNode;
			} else if (isLeftChild) {
				parent.leftNode = current.leftNode;
			} else {
				parent.rightNode = current.leftNode;
			}
		} else if (current.leftNode == null) {
			if (current == root) {
				root = current.rightNode;
			} else if (isLeftChild) {
				parent.leftNode = current.rightNode;
			} else {
				parent.rightNode = current.rightNode;
			}
		} else if (current.leftNode != null && current.rightNode != null) {

			// now we have found the minimum element in the right sub tree
			Node successor = getSuccessor(current);
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftNode = successor;
			} else {
				parent.rightNode = successor;
			}
			successor.leftNode = current.leftNode;
		}
		return true;
	}

	public Node getSuccessor(Node deleleNode) {
		Node successsor = null;
		Node successsorParent = null;
		Node current = deleleNode.rightNode;
		while (current != null) {
			successsorParent = successsor;
			successsor = current;
			current = current.leftNode;
		}
		// check if successor has the right child, it cannot have left child for
		// sure
		// if it does have the right child, add it to the left of
		// successorParent.
		// successsorParent
		if (successsor != deleleNode.rightNode) {
			successsorParent.leftNode = successsor.rightNode;
			successsor.rightNode = deleleNode.rightNode;
		}
		return successsor;
	}
}
