package inner_classes;
//• the classes that are declared inside another class are called as inner class or nested class

//•	Inner classes have a special type of relationship that it can access all the members of outer class including private
//•	More readable and maintainable
//•	Inner class requires less code
//Types : 
//•	Non-static nested class (inner class)
//•	Member inner class
//•	Anonymous inner class
//•	Local inner class
//•	Static nested class

public class AboutMemberInnerClass {
	// non-static class that is created inside a class but outside a method is
	// called member inner class.

	private int a = 10;

	public class Inner {
		void innerMethod() {
			System.out.println("inner class method");
			// accessing the private data member of outer class.
			System.out.println("value : " + a);
			// calling from static method
			// calling from instance method
		}
	}

	void outerMethod() {
		//Inner inner = new Inner();
		// 1
//		inner.innerMethod();
		System.out.println("outer class method");

	}

	public static void main(String[] args) {
		AboutMemberInnerClass obj = new AboutMemberInnerClass();
		obj.outerMethod();
		System.out.println(obj.getClass().getName());
		System.out.println("modifiers : "+obj.getClass().getModifiers());

		System.out.println("---------------------");
		// 2
		AboutMemberInnerClass.Inner i = new AboutMemberInnerClass().new Inner();
		i.innerMethod();

		System.out.println(i.getClass().getName());
		//Returns the Java language modifiers for this class 
		System.out.println("Modifiers : "+i.getClass().getModifiers());

//		Inner inner=new Inner();
//		inner.innerMethod();
	}

}
