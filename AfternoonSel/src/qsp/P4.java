package qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P4 {

	public static void main(String[] args) {
		Set<String> a1 = new HashSet<String>();
		a1.add("apple");
		a1.add("banana");
		a1.add("mango");
		a1.add("apple");
		a1.add("sapota");
		a1.add("santra");
		a1.add("draksha");
		a1.add("apple");
		a1.add("litchi");
		a1.add("peach");
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println("==========");
		for(String v : a1) {
			System.out.println(v);
		}
		
	}

}
