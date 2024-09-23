package assignment;

import java.util.Scanner;

public class Ass5_ScannClas {

	public static void main(String[] args) {
		int r;
		double pi=3.14;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter radius");
		r=sc.nextInt();
		double area=pi*r*r;
		System.out.println("area of circle->" +area);
		

	}

}
