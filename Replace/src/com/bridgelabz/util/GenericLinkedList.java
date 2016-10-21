package com.bridgelabz.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Node<T> {

	private T item = null;
	private Node<T> nextNode = null;

	public Node(T item, Node<T> nextNode) {
		this.item = item;
		this.nextNode = nextNode;
	}

	public void setNext(Node<T> next) {
		nextNode = next;
	}

	public void setValue(T item) {
		this.item = item;
	}

	public Node<T> getNext() {
		return nextNode;
	}

	public T getValue() {
		return item;
	}
}

public class GenericLinkedList<T> {

	public Node<T> head;
	public int size;
	Scanner s;

	// CREATING CONSTRUCTOR
	public GenericLinkedList() {
		head = null;
		size = 0;
	}

	// RETURNING THE SIZE OF LINKED LIST
	public int size() {
		return size;
	}

	// READING FROM A FILE IN GENERIC LINKED LIST
	@SuppressWarnings("unchecked")
	public GenericLinkedList<T> ReadFile(String filepath) {
		try {
			s = new Scanner(new File(filepath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		GenericLinkedList<T> list = new GenericLinkedList<T>();
		while (s.hasNext()) {
			AddAtEnd((T) s.next());
		}
		s.close();
		return list;
	}

	// ADDING AT THE END IN THE LINKED LIST
	public void AddAtEnd(T value) {
		if (head == null) {
			head = new Node<T>(value, null);
		} else {
			Node<T> node = head;
			while (node.getNext() != null) {
				node = node.getNext();
			}
			node.setNext(new Node<T>(value, null));
		}
		size++;
	}

	// ADDING AT A SPECIFIED POSITION IN LINKED LIST
	public void AddAtPos(T value, int pos) {
		Node<T> node = head;

		if ((pos < 1) || (pos > size)) {
			System.out.println("Invalid value of position");
		}

		for (int i = 1; i < pos - 1; i++)
			node = node.getNext();

		node.setNext(new Node<T>(value, node.getNext()));
		size++;
	}

	// WRITING FROM GENERIC LINKED LIST INTO THE FILE
	public void WriteFile(String filepath, GenericLinkedList<T> my_list) throws IOException {
		FileWriter writer = new FileWriter(filepath);
		Node<T> node = head;
		while (node != null) {
			writer.write(node.getValue() + " ");
			node = node.getNext();
			writer.flush();
		}
		writer.close();
	}

	// SEARCHING IN A LINKED LIST
	public String ListSearch(T value) {
		String str, str1, str2;
		str = "LIST IS EMPTY";
		str1 = "DATA FOUND";
		str2 = "DATA NOT FOUND";
		Node<T> node = head;

		if (node == null) {
			return str;
		} else {
			while (node != null) {
				if ((Integer) value == Integer.parseInt((String) node.getValue()))
					return str1;
				node = node.getNext();
			}
			return str2;
		}
	}

	// REMOVING ELEMENT FROM LINKED LIST
	public void RemoveElement(T value) {
		Node<T> node = head;
		while (node != null) {
			if ((Integer) value == Integer.parseInt((String) node.getNext().getValue())) {
				node.setNext(node.getNext().getNext());
				break;
			}
			node = node.getNext();
		}
		size--;
	}

	// SORTING A LINKED LIST
	public void SortList(GenericLinkedList<T> list) {

		Node<T> node = head;
		T swap;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (Integer
						.parseInt((String) node.getValue()) > (Integer.parseInt((String) node.getNext().getValue()))) {

					swap = node.getNext().getValue();
					node.getNext().setValue(node.getValue());
					node.setValue(swap);
				}
				node = node.getNext();
			}
			node = head;
		}
	}
}
