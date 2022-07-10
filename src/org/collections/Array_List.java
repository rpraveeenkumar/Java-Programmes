package org.collections;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(50);
		al.add(80);
		al.add(95);
		al.add("praveen");
		al.add('$');
		System.out.println(al);
		al.add("kumar");
		System.out.println(al.add("priya"));
		al.add(1, "name");
		System.out.println(al);
		System.out.println(al.size());
		al.remove(3);
		al.set(6, "mental");
		System.out.println(al.indexOf(2));
		System.out.println(al);
		System.out.println(al.contains("praveen"));
		System.out.println(al.get(5));
		
		ArrayList a2 = new ArrayList();
		
		a2.addAll(al);
		System.out.println(a2);
		List subList = al.subList(1, 4);
		System.out.println(subList);
		System.out.println(al.subList(2, 5));
	}
}
