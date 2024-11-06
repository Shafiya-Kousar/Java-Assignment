package assignment;

import java.util.Arrays;

public class Ass36_NoOfACDS {

	static int count_of_alphabet;
	static int count_of_numeric;
	static int count_of_space;
	static int count_of_specialChar;
	public static void main(String[] args) {
		String input="#12 A street bangalore";
		char c1[]=input.toCharArray();
		
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<input.length();i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				count_of_alphabet++;
				
			}
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true)
			{
				count_of_numeric++;
			}
			boolean b3=Character.isWhitespace(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}
			System.out.println("no of alphabets are->"+count_of_alphabet);
			System.out.println("no of digits are->"+count_of_numeric++);
			System.out.println("no of spaces are->"+count_of_space++);
		
		
			int count_of_specia=input.length()-(count_of_alphabet+count_of_numeric+count_of_space);
			System.out.println("no of special characyers are" +count_of_specia);
				
	}

}
