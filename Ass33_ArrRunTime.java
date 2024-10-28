package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Ass33_ArrRunTime {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(a));

	}

}
