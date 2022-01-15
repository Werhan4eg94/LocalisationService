
public class EspanolLocalisation implements LocalisationInterface {

	@Override
	public void sayHello(String name, String sex) {
		if (sex.equals("male")) {
			System.out.println("Hello,senior " + name);
		}
		if (sex.equals("female")) {
			System.out.println("Hello,seniora " + name);
		}

	}
}
