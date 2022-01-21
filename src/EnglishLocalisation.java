import java.time.LocalDateTime;
import java.util.Scanner;

public class EnglishLocalisation implements LocalisationInterface {

	@Override
	public void sayHello(String name, String sex, int age) {
		if (sex.equals("male") & age % 2 == 1) {
			System.out.println("Hello,Sir" + name);
			System.out.println(LocalDateTime.now());
		}
		if (sex.equals("female") & age % 2 == 0) {
			System.out.println("Hello,Miss" + name);
			System.out.println(LocalDateTime.now());
		}
		if (sex.equals("married") & age >= 100) {
			System.out.println("Hello,Missis" + name);
			System.out.println(LocalDateTime.now());
		}

	}

}
