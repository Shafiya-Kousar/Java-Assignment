package assignment;

public class Ass3_StatMethod_OP {
	public static void add() 
	{
		int sum=10+20;
		System.out.println("Addition->"+sum);
				
	}
	public static void sub() 
	{
		int diff=10-20;
		System.out.println("Subtraction->"+diff);
				
	}
	public static void mul() 
	{
		int prd=10*20;
		System.out.println("Multiplication->"+prd);
				
	}
	public static void div() 
	{
		int quo=100/20;
		System.out.println("Division->"+quo);
				
	}
	public static void mod() 
	{
		int rem=100%20;
		System.out.println("Modulos->"+rem);
				
	}
	

	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();

	}

}
