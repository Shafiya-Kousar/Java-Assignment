package assignment;

import java.util.Scanner;

public class Ass7_TrianAreaSc {

	public static void main(String[] args) {
		double area,breadth,height;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the breadth->");
		breadth=sc.nextInt();
		System.out.println("Enter the Height");
		height=sc.nextInt();
		area=0.5*breadth*height;
		System.out.println("Area of Triangle ->" +area);
		
		

	}

}
