package test;

import selenium.Test4;

public class Test1 {
	 static Test1 t1=new Test1();
	 static Test2 t2=new Test2();
	 static Test3 t3=new Test3();
	 static Test4 t4=new Test4();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
printMe();
System.out.println("after printMe");
scanMe();

t1.testMe();
t1.copyMe();
Test2.testing1();
t2.testing2();
Test3.testing3();
t3.testing4();
Test4.testing5();
t4.testing6();

	}
	
	public static void printMe()
	{
		System.out.println("I'm in printMe");
	}
	
	public static void scanMe()
	{
		System.out.println("I'm in scanMe");
	}
	
	public  void testMe()
	{
		System.out.println("I'm in testMe");
	}
	
	public  void copyMe()
	{
		System.out.println("I'm in copyMe");
	}
	

}
