package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNoRepetableString {
	
	public static void main(String args[]){
		String str = "aabbcddeeffg";
		System.out.println("First Non Repetable ::"+printFirstNoNRepetable(str));
	}
	
	public static Character printFirstNoNRepetable(String str){
		if(str == null || str.trim().length() ==0){
			return null;
		}

		Queue<Character> repetable = new LinkedList<Character>();
		Queue<Character> nonRepetable = new LinkedList<Character>();
		
		char[] charArr = str.toCharArray();
		
		for(int i =0; i<charArr.length; i++){
			
			if(nonRepetable.contains(charArr[i])){
			      nonRepetable.remove(charArr[i]);
			      repetable.add(charArr[i]);
			}else{
				nonRepetable.add(charArr[i]);
			}
			
		}
		System.out.println(nonRepetable.size());
		
		return nonRepetable.poll();
	}

}
