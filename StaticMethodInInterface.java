package javaprograms;

interface Ice {
	public static void eat() {
		System.out.println("eating icecream");
	}

	class Cream implements Ice{
	/*	@Override */                 //static methods can't be overridden in implementing classes.
		 public void eat() {
	
			
		}
	}
}
public class StaticMethodInInterface{
	public static void main(String[] args) {
		
		Ice.eat();                  //static method is called by classname
	   /* Cream s=new  Cream();
	    s.eat(); */                // static method can't be called by implementing class object 
		
	}
}
