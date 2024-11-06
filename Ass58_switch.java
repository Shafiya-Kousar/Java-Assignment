package assignment;

import java.util.Scanner;

public class Ass58_switch {
	
	static int a=10;
	static int b=5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ope;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operation 1-4");
		ope=sc.nextInt();
		
		switch(ope)
		{
		case 1: System.out.println("Addition");
				int add=a+b;
				System.out.println("Addition:" +add);
				break;
		case 2:System.out.println("Subtraction");
				int sub=a-b;
				System.out.println("Sutraction:" +sub);
				break;
		case 3:System.out.println("Multiplication");
		        int prd=a*b;
		        System.out.println("Multiplicatio :" +prd);
		        break;
		case 4:System.out.println("Division");
				int div=a/b;
				System.out.println("Division:" +div);
				break;
		default:System.out.println("Invalid entry");
		}
	}

}
