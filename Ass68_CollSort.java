package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ass68_CollSort {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(2909);
		li.add(3909);
		li.add(1909);
		li.add(909);
		li.add(99);
		li.add(209);
		
		
		Collections.sort(li);
		System.out.println(li);
		
		
	}

}
