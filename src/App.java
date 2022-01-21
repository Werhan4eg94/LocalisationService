import java.security.Timestamp;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Your Language:");
		String language = scan.nextLine();
		System.out.print("Your male/female:");
		String sex = scan.nextLine();
		System.out.println("Your age:");
		int age = scan.nextInt();
	
		

		if (language.equals("En")) {
			LocalisationInterface english = new EnglishLocalisation();
			english.sayHello("!", sex, age);
			
		}

		if (language.equals("Ua")) {
			LocalisationInterface ua = new UaLocalisation();
			ua.sayHello("!", sex, age);
		}

		if (language.equals("Es")) {
			LocalisationInterface espanol = new EspanolLocalisation();
			espanol.sayHello("!", sex, age);
		}

		
		if(language.equals("Sc")) {
			LocalisationInterface scottish = new ScottishLocalisation();
			scottish.sayHello("!", sex, age);
		}
		
		

			
			
		}
		
		}
	


