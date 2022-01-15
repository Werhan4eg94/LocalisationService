import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Your Language:");
		String language = scan.nextLine();
		System.out.print("Your male/female:");
		String sex = scan.nextLine();
		System.out.println("Your old:");
		String status = scan.nextLine();

		if (language.equals("En")) {
			LocalisationInterface english = new EnglishLocalisation();
			english.sayHello("!", sex);
		}

		if (language.equals("Ua")) {
			LocalisationInterface ua = new UaLocalisation();
			ua.sayHello("!", sex);
		}

		if (language.equals("Es")) {
			LocalisationInterface espanol = new EspanolLocalisation();
			espanol.sayHello("!", sex);
		}

		if (status.equals("27")) {
			LocalisationInterface english = new EnglishLocalisation();
			english.basicOutput("notes", sex);
		}
	}

}
