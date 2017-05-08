package com.stack.queue;

import java.util.Arrays;

public class MyList<E> {
	
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] elements = new Object[DEFAULT_CAPACITY];
	
	public void add(E e){
		if(size == elements.length){
			ensureCapcity();
		}
		elements[size++] = e;
	}
	
	
	public E remove(int index){
		E e = (E)elements[index];
		int temp = index;
		elements[index] = null;
		size--;
		while(temp < size){
			elements[index] = elements[index+1];
			temp++;
		}
		return e;
	}
	
	private void ensureCapcity(){
		int newSize = elements.length*2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public static void main(String args[]){
		MyList<Integer> list = new MyList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(Arrays.toString(list.elements));
		list.remove(2);
		System.out.println(Arrays.toString(list.elements));
	}

}
