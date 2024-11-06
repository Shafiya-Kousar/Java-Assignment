package assignment;

public class Ass59_StringtoArray {


		 public static void main(String args[])
		    {

		        
		        String str = "Myself Shafiya";

		        // Creating array of string length
		        // using length() method
		        char[] ch = new char[str.length()];

		        // Copying character by character into array
		        // using for each loop
		        for (int i = 0; i < str.length(); i++) {
		            ch[i] = str.charAt(i);
		            System.out.println(ch[i]);
		        }

		        // Printing the elements of array
		        // using for each loop
		        //for (char c : ch) {
		          //  System.out.println(c);
		        //}

	}

}
