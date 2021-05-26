package br.com.jcc;

public class Stack {
	private int array[];
	private int top;
	private int capacity;
	
	public Stack(int capacity) {
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int item){
		if(this.isFull()){
			throw new RuntimeException("Stack is full");
		}
		this.array[++top] = item;
	}

	public int pop(){
		if(this.isEmpty()){
			throw new RuntimeException("Stack is empty");
		}
		return this.array[top--];
	}

	public int peek(){
		if(this.isEmpty()){
			throw new RuntimeException("Stack is empty");
		}
		return this.array[top];
	}
	
	private boolean isEmpty() {
		return this.top == -1;
	}
	
	private boolean isFull() {
		return this.top == this.capacity - 1;
	}
}
