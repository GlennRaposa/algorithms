package com.string;

public class FindDuplicateCharacters {
	
	public static void main(String args[]){
		String str = "Programming";
		System.out.println("Find Duplicates ::"+findDuplicates(str));
		System.out.println("Remove Duplicates ::"+removeDuplicates(str));
	}

	
	private static String findDuplicates(String word) {

	    StringBuilder temp = new StringBuilder();
	    StringBuilder dup = new StringBuilder();

	    for (int i = 0; i < word.length(); i++) {
	        if (temp.indexOf("" + word.charAt(i)) == -1) {
	            temp.append(word.charAt(i));
	        }else{
	        	dup.append(word.charAt(i));
	        }
	    }

	    return dup.toString();
	}


	private static String removeDuplicates(String word) {

	    StringBuilder temp = new StringBuilder();

	    for (int i = 0; i < word.length(); i++) {
	        if (temp.indexOf("" + word.charAt(i)) == -1) {
	            temp.append(word.charAt(i));
	        }
	    }

	    return temp.toString();
	}
	

}
