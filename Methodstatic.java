package com.staticMethod;


interface TestInterface
{
	
	public void square (int a);

	
	static void show()
	{
		System.out.println("Static Method Executed");
	}
}

class Methodstatic implements TestInterface
{

	public void square (int a)
	{
		System.out.println(a*a);
	}

	public static void main(String args[])
	{
		Methodstatic d = new Methodstatic();
		d.square(4);

		
		TestInterface.show();
	}
}

