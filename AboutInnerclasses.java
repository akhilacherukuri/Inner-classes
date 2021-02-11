package inner_classes;

class outer {
	class inner { // is a relationship
		void innerMethod() {
			System.out.println("inner method");
		}
	}
	public static void main(String[] args) {
		outer o =new outer();
		
		
	}
}

public class AboutInnerclasses extends outer { // has a relationShip

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer obj= new AboutInnerclasses();
		

	}

}
