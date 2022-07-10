package org.array;

public class String_Collections {
	
	
	public static void main(String[] args) {
		
		String s = "welcome mr praveen";
		String s1=" WELCOME MR PRAVEEN ";
		String s2="";
		String s3=null;
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int length = s.length();
		System.out.println(length);
		
		int length1 = s1.length();
		System.out.println(length1);
		
		int length2 = s2.length();
		System.out.println(length2);
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean equals2 = s1.equals(s2);
		System.out.println(equals2);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("s");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("N");
		System.out.println(endsWith);
		
		boolean contains = s.contains("mr");
		System.out.println(contains);
		
		int indexOf = s.indexOf("e"); //showing the letter 1st index  
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("e"); //showing the letters last index
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(15);
		System.out.println(charAt);
		
		String replace = s.replace("mr", "don");
		System.out.println(replace);
		
		String substring = s.substring(3);
		System.out.println(substring);
		
		boolean empty = s2.isEmpty();
		System.out.println(empty);
		
		String trim = s1.trim(); //removes whitespace from both ends of a string
		System.out.println(trim);
		
		int compareTo = s.compareTo(s1);
		System.out.println(compareTo);
		
		String[] split = s.split("  ");
		for (String string : split) {
			System.out.print(string);
			
		}
				
		
	}

}
