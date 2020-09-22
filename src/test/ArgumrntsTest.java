package test;

public class ArgumrntsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sum();
sum(2,3);
sum(3,6,7);
	}
	
	public static void sum()
	{
		int a=2+3;
		System.out.println(a);
	}
	
	public static void sum(int x,int y)
	{
		int z=x+y;
		System.out.println(z);
	}
	
	public static void sum(int p,int q,int r)
	{
		int y=p*q*r;
		System.out.println(y);
	}

}
