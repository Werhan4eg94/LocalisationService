
public class UaLocalisation implements LocalisationInterface {

	@Override
	public void sayHello(String name, String maleorfemaleormarried) {
		if (maleorfemaleormarried.equals("male")) {
			System.out.println("Hello,pan " + name);
		}
		if (maleorfemaleormarried.equals("female")) {
			System.out.println("Hello,pani " + name);
		}
	}

}
