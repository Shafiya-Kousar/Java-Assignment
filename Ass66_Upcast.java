package assignment;
class SuperMost
{
	public SuperMost() {
	
		System.out.println("Constructor");
	}
}
public class Ass66_Upcast extends SuperMost {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMost s=(SuperMost)new Ass66_Upcast();//class cast
		
		int a=100;
		double b=(double)a;//type cast
		System.out.println(b);
		
		

	}

}
