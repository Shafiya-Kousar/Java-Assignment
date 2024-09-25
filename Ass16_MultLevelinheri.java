package assignment;

public class Ass16_MultLevelinheri extends Parent1
{
	public static void main(String args[]) 
	{
	
		Ass16_MultLevelinheri rf=new Ass16_MultLevelinheri();
		System.out.println("Multi level Inheritance");
		
		rf.add();
		rf.sub();
		rf.mul();
		mod();
		ml();
		ad();
		
		
		
	}

}
class Parent1 extends Parent2
{
	void add()
	{
		System.out.println("Calling non-static method of Parent1");
		int add=100+2;
		System.out.println(add);
	}
	static void mod() {
        
		System.out.println("Calling static method of Parent1");
		int modu=20%30;
		System.out.println(modu);
       	
	}
	
	}
class Parent2 extends Parent3
{
	void sub() {
		System.out.println("Calling non-static method of Parent2");
		
		int diff=100-2;
		System.out.println(diff);
		
	}
	static void ml() {
        
		System.out.println("Calling static method of Parent 2");
		int prd=20*30;
		System.out.println(prd);
       	
	}
	}
class Parent3
{
	void mul() {
		System.out.println("Calling non-static method of Parent 3");
		int prd=100*2;
		System.out.println(prd);
	}
	static void ad() {
         
		System.out.println("Calling static method of Parent 3");
		int sum=20+30;
		System.out.println(sum);
       	
	}
}