package com.j_prac;

public class Main{
	public static void main(String [] args) {
		var list = new LinkedList();
		list.addFirst(11);
		list.addLast(22);
		list.addFirst(1234);
		System.out.println(list.indexOf(22));
	}
}