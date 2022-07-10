package org.getter_setter;

public class ClassB {

	public static void main(String[] args) {
		
		 ClassA ref=new ClassA();
		 
		 int num = ref.getAge();
		 System.out.println(num);
		 
		 ref.setAge(40);
		 
		 int num2 = ref.getAge();
		 System.out.println(num2);
	}
}
