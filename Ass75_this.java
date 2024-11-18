package assignment;

public class Ass75_this {

	int rollno;  
	String name;  
	float fee;  
     Ass75_this(int rollno,String name,float fee)
     {  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee; 
     }
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+fee);
    	 }  
     
	public static void main(String[] args) {
		
		Ass75_this s1=new Ass75_this(111,"ankit",5000f);  
		Ass75_this s2=new Ass75_this(112,"sumit",6000f);  
		s1.display();  
		s2.display(); // TODO Auto-generated method stub

		
	}

}
