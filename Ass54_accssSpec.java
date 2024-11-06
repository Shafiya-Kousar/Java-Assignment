package assignment;

public class Ass54_accssSpec {

	public void show() {
		System.out.println("public show");
	}
	private void display()
	{
		System.out.println("private display");
	}
	protected void print()
	{
		System.out.println("protected print");
	}
	 void test()
	{
	 System.out.println("default testing");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass54_accssSpec as =new Ass54_accssSpec();
		as.show();
		as.display();
		as.print();as.test();
		
	}

}
