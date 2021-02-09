package inner_classes;

//A class that have no name is known as anonymous inner class in java. It should be used if you have to override method of class or interface.
class parent {
	void sample() {
		System.out.println("parent class method");
	}
}

public class AboutAnonymous {
	public static void main(String[] args) {
		parent obj = new parent();
		obj.sample();
		// anonymous class
		parent obj1 = new parent() {
			void sample() {
				System.out.println("anonymous class method");
			}
		};
		obj1.sample();
	}
}
