import java.util.Scanner;

public class EnglishLocalisation implements LocalisationInterface {

	@Override
	public void sayHello(String name, String sex) {
		if (sex.equals("male")) {
			System.out.println("Hello,Sir" + name);
		}
		if (sex.equals("female" + name)) {
			System.out.println("Hello,Miss");
		}
		if (sex.equals("married")) {
			System.out.println("Hello,Missis" + name);
		}
	}

}
