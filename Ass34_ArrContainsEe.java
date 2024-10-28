package assignment;

public class Ass34_ArrContainsEe {

	public static void main(String[] args) {
		
		int a[]=new int[4];
		a[0]=21;
		a[1]=34;
		a[2]=50;
		a[3]=12;
		
		int toCheck=50;
		for(int i=0;i<a.length;i++) {
			
			if(toCheck==a[i])
			{
				System.out.println(toCheck+ "is present at index position" +i);
			}
		}
		
	}

}
