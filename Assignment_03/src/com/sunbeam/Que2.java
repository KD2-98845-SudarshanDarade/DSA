package com.sunbeam;

public class Que2 {
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node sortedInsert(Node head, int key) {
       
        Node newNode = new Node(key);
        
        if(head == null || key <= head.data){
            newNode.next = head;
            head = newNode;
            return head;
        }
        
        Node temp = head;
       
        while(temp.next != null && temp.next.data < key ){
            temp = temp.next;
        }
        
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
