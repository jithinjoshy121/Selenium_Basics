	package test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tools = new ArrayList<String>();

		tools.add("selenium");
		tools.add("qtp");
		tools.add("Jira");
		tools.add("QC");
		tools.add("Postman");
		
		System.out.println(tools);
		System.out.println(tools.size());
		
		System.out.println(tools.get(2));
	}

}
