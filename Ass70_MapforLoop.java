package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ass70_MapforLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> m=new HashMap<String,Integer>();
	    m.put("Anu", 121);
	    m.put("Baala",212);
	    m.put("Deepak",312);
	    m.put("Rahul", 345);
	    m.put("Swapna", 434);
	    
	    System.out.println(m);
	    
	    for(Entry <String, Integer> ie : m.entrySet())
	    {
	    	System.out.println(ie);
	    }
	    for(Integer i:m.values())
	    {
	    	System.out.println(i);
	    }
	}

}
