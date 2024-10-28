package assignment;

import java.util.Scanner;

public class Ass25_StrRev {

	public static void main(String[] args) {
		//String s= "Shafiya";
		String s;
		String rs="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to reverse:");
		s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			rs=s.charAt(i)+rs;
		}
		System.out.println(rs);

	}

}
