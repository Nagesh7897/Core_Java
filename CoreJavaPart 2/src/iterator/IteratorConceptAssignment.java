package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorConceptAssignment {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(25);
		list.add(65);
		list.add(31);
		list.add(45);
		list.add(72);
		list.add(30);
		
		Iterator<Integer> age = list.iterator();
		while (age.hasNext()) {
			int abc =age.next();
			if(abc< 60) {
			System.out.println(abc);
			}
			else {
				System.out.println("Age is more than 60 need to give bonus " +abc);
			}
		}

	}

}
