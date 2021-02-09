package inner_classes;
abstract class sample{
	abstract void cat();
}
public class AboutAnonymous1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj = new sample() {

			@Override
			void cat() {
				System.out.println("mew mew");
				
			}
		
		};
		obj.cat();
	}

}
