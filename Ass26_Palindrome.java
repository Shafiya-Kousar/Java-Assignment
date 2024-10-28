package assignment;

import java.util.Scanner;

public class Ass26_Palindrome {

	public static void main(String[] args) {
	//	String s="civic";
		String es="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to check if it is Palindrome:");
		String s=sc.next();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			es=es+s.charAt(i);
		}
		System.out.println(es);

		if(s.toLowerCase().equals(es.toLowerCase())) {
			System.out.println("String is Paindrome");
		}
			else
			{		
			System.out.println("String is not Paindrome");
		}
	}

}
