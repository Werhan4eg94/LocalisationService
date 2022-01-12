import java.util.Scanner;

public class App {

	private static final String Andrey = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Your Language:");
		String language = scan.nextLine();
		System.out.print("Your male/female:");
		String maleorfemaleormarried = scan.nextLine();

		if (language.equals("En")) {
			LocalisationInterface english = new EnglishLocalisation();
			english.sayHello("!", maleorfemaleormarried);
		}

		if (language.equals("Ua")) {
			LocalisationInterface english = new UaLocalisation();
			english.sayHello("!", maleorfemaleormarried);
		}

		if (language.equals("Es")) {
			LocalisationInterface english = new EspanolLocalisation();
			english.sayHello("!",maleorfemaleormarried);
		} 
		
		LocalisationInterface english = new EspanolLocalisation();
 
		    
		
		}

	
	}
