package inner_classes;

public class AnonymousRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable is inner class
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("inner Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println("outer Thread");

	}

}
