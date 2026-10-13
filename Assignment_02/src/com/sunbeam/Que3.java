public class 
package com.sunbeam;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int count;

    public CircularQueue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == arr.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int value = arr[front];
        front = (front + 1) % arr.length;
        count--;

        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < count; i++) {
            int index = (front + i) % arr.length;
            System.out.print(arr[index] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.enqueue(60);
        q.enqueue(70);

        q.display();

        System.out.println("Front element: " + q.peek());
        System.out.println("Count: " + q.count);
    }
} 