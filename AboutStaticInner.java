package inner_classes;
//Static nested class : A static class i.e. created inside a class is called static nested class in java.
//It cannot access non-static data members and methods. It can be accessed by outer class name.

      //o	It can access static data members of outer class including private.
      //o	Static nested class cannot access non-static (instance) data member or method.

public class AboutStaticInner {
	static class Inner {
		void innerMethod() {
			System.out.println("inner method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner inner = new Inner();
		inner.innerMethod();
	}

}
