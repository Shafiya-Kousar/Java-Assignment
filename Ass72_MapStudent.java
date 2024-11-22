package assignment;

import java.util.HashMap;
import java.util.Map;

public class Ass72_MapStudent {

	public static void main(String[] args) {
		
		Map<String, Integer> st= new HashMap<String, Integer>();
		st.put("Student1", 11);
		st.put("Student2", 12);
		st.put("Student3", 13);
		st.put("Student4", 14);
		st.put("Student5", 15);
		
				
		System.out.println(st.containsKey("Student3"));
		System.out.println(st.containsValue(15));

		
	}

}
