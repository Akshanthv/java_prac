package com.j_prac;

public class LinkedList{

	private class Node {
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
	}
	private Node first;
	private Node last;
	
	public void addLast(int item) {
		var node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		}
		else{
			last.next=node;
			last=node;
		}		
	}
	
	public void addFirst(int item) {
		var node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		}
		else {
			node.next=first;
			first=node;
		}
	}
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while(current != null) {
			if(current.value == item) {
				return index;
			}
			
			index++;
			current=current.next;
		}
		return -1;
	}
	public void addMid(int item) {
		
	}
	
	public void rev() {
		while()
	}
	
	private Boolean isEmpty() {
		return first==null;
	}
	
}