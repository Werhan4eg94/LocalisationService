
public class UaLocalisation implements LocalisationInterface {

	@Override
	public void sayHello(String name, String sex) {
			if("Female".equalsIgnoreCase(sex)) {
				System.out.println("Hello, Pani " + name);
			}
			if("Male".equalsIgnoreCase(sex)) {
				System.out.println("Hello, Pan " + name);
			}

	}

}

