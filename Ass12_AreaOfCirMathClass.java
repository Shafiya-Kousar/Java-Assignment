package assignment;

import java.util.Scanner;

public class Ass12_AreaOfCirMathClass {

	public static void main(String[] args) {
		int radius;
		Scanner sc= new Scanner(System.in);
		radius=sc.nextInt();
		double area=Math.PI*radius*radius;
		System.out.println("Area of circle is->" +area);
		

	}

}
