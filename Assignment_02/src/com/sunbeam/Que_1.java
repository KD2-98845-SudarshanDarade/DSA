package com.sunbeam;
class Queue{
	 private int arr[];
	  private int SIZE;
	  private int front;
	  private int rear;

	  public Queue(int size){
	    SIZE = size;
	    arr = new int[SIZE];
	    front = rear = 0;
	  }
	  public void offer(int val){
	    if(isFull()){
	      System.out.print("Stack is Full");
	      return;
	    }
	    arr[rear++] = val;
	  }
	  public int peek(){
	    if(isEmpty()){
	      System.out.print("Stack is Empty");
	      return -1;
	    }
	    return arr[front];
	  }
	  public int poll(){
	    if(isEmpty()){
	      System.out.print("Stack is Empty");
	      return -1;
	    }
	    return arr[front++];
	  }
	  public boolean isEmpty(){
	    return front == rear;
	  }
	  public boolean isFull(){
	   return rear == SIZE - 1;
	   }
}


public class Que_1{
	public static void main(String[] args) {
		
	}
}