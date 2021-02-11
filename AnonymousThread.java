package inner_classes;

public class AnonymousThread {

	public static void main(String[] args) {

		// Here we are using Anonymous Inner class
		// Thread class is a inner class
		Thread t = new Thread() {
			public void run() {
				System.out.println("inner Thread");
			}
		};
		t.start();
		System.out.println("outer Thread");

	}

}
