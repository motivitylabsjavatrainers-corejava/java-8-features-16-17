package com.methods;

interface TestInterface
{
	
	public void square(int a);

	
	default void show()
	{
	System.out.println("Default Method Executed");
	}
}

class Abstract implements TestInterface
{
	public void square(int a)
	{
		System.out.println(a*a);
	}

	public static void main(String args[])
	{
		Abstract d = new Abstract();
		d.square(4);

		
		d.show();
	}
}

