package assignment;

import java.util.Arrays;

public class Ass32_ArrEqual {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		int a1[]=new int[5];
		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		a1[3]=4;
		a1[4]=5;
		
		System.out.println(Arrays.equals(a, a1) + "Arrays are equal");
		
	}

}
