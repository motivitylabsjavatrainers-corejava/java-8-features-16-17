package com.newintface;


interface NewInterface {

	static void hello()
	{
		System.out.println("Hello, New Static Method Here");
	}

	void overrideMethod(String str);
}


public class InterfaceDemo implements NewInterface {

	public static void main(String[] args)
	{
		InterfaceDemo interfaceDemo = new InterfaceDemo();

		
		NewInterface.hello();

		
		interfaceDemo.overrideMethod("Hello, Override Method here");
	}

	

	@Override
	public void overrideMethod(String str)
	{
		System.out.println(str);
	}
}

