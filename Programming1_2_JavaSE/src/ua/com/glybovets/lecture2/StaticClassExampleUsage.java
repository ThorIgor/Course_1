package ua.com.glybovets.lecture2;

public class StaticClassExampleUsage {

	public static void main(String[] args) {
		
		StaticClassExample first = new StaticClassExample();
		StaticClassExample second = new StaticClassExample();
		
		first.a=4;
		first.number=3;
		second.a=5;
		second.number=2;
		
		System.out.println("First a*number = "+first.getSomething());
		System.out.println("Second a*number = "+second.getSomething());
		System.out.println("First a = "+first.a);
		System.out.println("Second a = "+second.a);
		System.out.println("First numberOfCreatedObjects = "+first.numberOfCreatedObjects());
		System.out.println("Second numberOfCreatedObjects = "+second.numberOfCreatedObjects());
		System.out.println(StaticClassExample.numberOfCreatedObjects());
	}

}
