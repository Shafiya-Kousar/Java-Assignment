package assignment;

import java.util.Scanner;

public class Ass9_RectAreaSc {

	public static void main(String[] args) {
		int l,b,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length->");
		l=sc.nextInt();
		System.out.println("Enter the bredth->");
		b=sc.nextInt();
		area=l*b;
		System.out.println("Area of Rectangle is ->" +area);

	}

}
