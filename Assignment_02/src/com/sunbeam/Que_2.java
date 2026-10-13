package com.sunbeam;

class Stack{
  private int SIZE;
  private int arr[];
  private int top;

  public Stack(int size){
    SIZE = size;
    arr = new int[SIZE];
    top = SIZE;
  }

  public int pop(){
    if(isEmpty()){
      System.out.print("Stack is Empty");
      return -1;
    }
    return arr[top++];
  }
  public void push(int val){
    if(isFull()){
      System.out.print("Stack is Full");
      return;
    }
    arr[top--] = val;
  }
  public int peek(){
    if(isEmpty()){
      System.out.print("Stack is Empty");
      return -1;
    }
    return arr[top];
  }
  public boolean isEmpty(){
    return top == SIZE;
  }
  public boolean isFull(){
    return top == 0;
  }
}

public class Que_2 {

}
