
public class EspanolLocalisation implements LocalisationInterface {

	@Override
	public void sayHello(String name, String maleorfemaleormarried) {
		if (maleorfemaleormarried.equals("male")) {
			System.out.println("Hello,senior "  + name );
		}
		if (maleorfemaleormarried.equals("female")) {
			System.out.println("Hello,seniora " + name);
		}
	}
}
