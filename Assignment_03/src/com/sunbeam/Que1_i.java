package com.sunbeam;

public class Que1_i {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node addAfterPosNode(Node head ,int val , int pos , int size) {
		Node newNode = new Node(val);
		
		if(pos < 1 || pos > size) {
			return head;
		}
		
		if(head == null) {
			head = newNode;
			return head;
		}
		
		
		Node temp = head;
		
		for(int i = 1 ; i < pos ; i++) {
		
			if(temp == null) {
				return head;
			}
			
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		return head;
	}
}
