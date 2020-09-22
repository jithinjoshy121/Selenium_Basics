package test;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=sum();
System.out.println(x);
System.out.println(sum());
String y=printMe();
System.out.println(y);
	}
	
	public static int sum()
	{
		int a=2+3;
		return a;
	}
	
	public static String printMe()
	{
		String s="Hello World";
		return s;
	}

}
