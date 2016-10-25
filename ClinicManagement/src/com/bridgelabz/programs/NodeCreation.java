
package com.bridgelabz.programs;

public class NodeCreation<T>{
	T data;
	NodeCreation<T> next;
	//Assigning the data value
	public void setData(T value){
		data = value;
	}
	//getting data value
	public T getData(){
		return data;
	}
	//Assigning next node
	public void setNext(NodeCreation<T> node){
		next = node;
	}
	//getting next node
	public NodeCreation<T> getNext(){
		return next;
	}
}