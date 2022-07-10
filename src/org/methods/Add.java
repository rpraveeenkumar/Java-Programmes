package org.methods;

public class Add {
	
	public static void main(String[] args) {
		
		System.out.println("hellow");
		int volume = boxvolume(11, 21, 35); //passing arguments
		System.out.println(volume);
	}

	public static int boxvolume(int l, int w, int h) { //method definition
		int vol;									   //method body
		vol=l*w*h;
		return vol;
		
	}
}
