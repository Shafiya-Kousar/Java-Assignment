package assignment;

public class Ass4_MethodOverl {
	
	public void add()
	{
		int sum=100+20;
			System.out.println("Method non-parameterised->" +sum);
	}
	public void add(int a)
	{
		int sum=100+a;
			System.out.println("Method 1 parameter->" +sum);
	}
	public void add(int a, int b)
	{
		int sum=100+a+b;;
			System.out.println("Method 2 parameters->" +sum);
	}
	public void add(int p, double q)
	{
		double sum=100+p+q;
			System.out.println("Method diff parameters->" +sum);
	}
	public void add(double x, double y)
	{
		double sum=100+x+y;
			System.out.println("Method diff parameters->" +sum);
			
	}
	public void add(char c)
	{
		System.out.println("Printing char->" +c);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ass4_MethodOverl ref = new Ass4_MethodOverl();
		ref.add();
		ref.add(10);
		ref.add(10,90);
		ref.add(20,20.5);
		ref.add(12.34,34.56);
		ref.add('S');
		
		
	}

}
