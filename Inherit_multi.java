package com.multi;

interface TestInterface1
{
	
	default void show()
	{
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2
{
	
	default void show()
	{
		System.out.println("Default TestInterface2");
	}
}


class Inherit_multi implements TestInterface1, TestInterface2
{
	
	public void show()
	{
		
		TestInterface1.super.show();

		
		TestInterface2.super.show();
	}

	public static void main(String args[])
	{
		Inherit_multi d = new Inherit_multi();
		d.show();
	}
}

