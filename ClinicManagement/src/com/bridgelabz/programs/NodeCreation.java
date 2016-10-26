
package com.bridgelabz.programs;

public class NodeCreation<T> {
	T data;
	NodeCreation<T> next;

	public void setData(T value) {
		data = value;
	}

	public T getData() {
		return data;
	}

	public void setNext(NodeCreation<T> node) {
		next = node;
	}

	public NodeCreation<T> getNext() {
		return next;
	}
}