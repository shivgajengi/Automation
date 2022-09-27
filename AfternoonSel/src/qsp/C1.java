package qsp;

import java.util.ArrayList;
import java.util.List;

public class C1 {

	public static void main(String[] args) {
		
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(15);
		a1.add(12);
		a1.add(85);
		a1.add(45);
		a1.add(10);
		a1.add(20);
		System.out.println(a1);
		System.out.println("Value at index 2: "+a1.get(2));	
		System.out.println("========================");
		System.out.println("Total objects: "+a1.size());
		System.out.println("========================");
		for(int i=0; i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		

	}

}
