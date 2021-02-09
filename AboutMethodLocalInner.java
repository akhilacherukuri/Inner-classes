package inner_classes;

public class AboutMethodLocalInner {
	// Local inner class : A class i.e. created inside a method is called local
	// inner class in java. If you want to invoke the methods of local inner class,
	// you must instantiate this class inside the method.
	void outerMethod() {
		class Inner {
			void innerMethod() {
				System.out.println("Inner class method");
			}
		}
		Inner i = new Inner();
		i.innerMethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AboutMethodLocalInner obj = new AboutMethodLocalInner();
		obj.outerMethod();

	}

}
