package assignment;

import java.util.Scanner;

public class Ass6_CicumOfCir {

	public static void main(String[] args) {
		int r;
		double pi=3.14, circum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
	    r=sc.nextInt();
	    circum=2*pi*r*r;
	    System.out.println("Circumference of circle->" +circum);

	}

}
