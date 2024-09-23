package assignment;

public class Ass2_NonStatic {
	
	public void add() 
	{
		int sum=10+20;
		System.out.println("Addition->"+sum);
				
	}
	public void sub() 
	{
		int diff=10-20;
		System.out.println("Subtraction->"+diff);
				
	}public void mul() 
	{
		int prd=10*20;
		System.out.println("Multiplication->"+prd);
				
	}public void div() 
	{
		int quo=100/20;
		System.out.println("Division->"+quo);
				
	}
	public void mod() 
	{
		int rem=100%20;
		System.out.println("Modulos->"+rem);
				
	}
	public static void main(String[] args) {
		
		Ass2_NonStatic r1 =new Ass2_NonStatic();
		r1.add();
		r1.sub();
		r1.mul();
		r1.div();
		r1.mod();

	}

}
