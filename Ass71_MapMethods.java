package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ass71_MapMethods {

	public static void main(String[] args) {
		
		Map<String, String> fq=new HashMap<String,String>();
	    fq.put("Apple", "22kg");
	    fq.put("Mango", "12kg");
	    fq.put("Pineapple", "10kg");
	    fq.put("Grapes", "15kg");
	    fq.put("Cherry", "31kg");
	    
	    System.out.println(fq.get("Cherry"));
	    
	    System.out.println(fq.remove("Grapes", "15kg"));
	    
	    Iterator <Entry <String, String>> i=fq.entrySet().iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    
	    

	}

}
