package assignment;

public class Ass30_ArrUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] =new int[5];
		a[0]=20;
		a[1]=200;
		a[2]=2000;
		a[3]=20000;
		a[4]=200000;
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		//System.out.println(a[2]);
		a[2]=1000;
		System.out.println(a[2]);
	}

}
