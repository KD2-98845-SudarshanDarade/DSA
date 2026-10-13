package com.sunbeam;

public class Que1_ii {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node insertPos(Node head, int pos, int val) {
        Node newNode = new Node(val);

        if (pos < 1) {
            return head;
        }

        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;
    }
}
