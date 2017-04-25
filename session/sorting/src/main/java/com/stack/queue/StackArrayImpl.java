package com.stack.queue;

public class StackArrayImpl {
	int size;
	int arr[];
	int top;
	
	StackArrayImpl(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int element){
		if(!isFull()){
			top++;
		    arr [top] = element;
			System.out.println("Pushed Element :"+element);
		}else{
			System.out.println("Stack Is Full");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			int currentTop = top;
			top --;
			System.out.println("POPPED Element :"+arr[currentTop]);
			return currentTop;
		}else{
			System.out.println("Stack Is Empty");
			return -1;
		}
	}
	
	public int peek(){
		return arr[top];
	}
	
	public boolean isEmpty(){
		return(top == -1);
	}
	
	public boolean isFull(){
		return (size-1 == top);
	}
	
	public static void main(String args[]){
		StackArrayImpl stackArrayImpl = new StackArrayImpl(10);
		stackArrayImpl.pop();
		System.out.println("======================");
		stackArrayImpl.push(10);
		stackArrayImpl.push(30);
		stackArrayImpl.push(50);
		stackArrayImpl.push(40); 
		System.out.println("======================");
		stackArrayImpl.pop();
		stackArrayImpl.pop();
		
	}
}
