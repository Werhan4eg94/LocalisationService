import java.util.Scanner;

public class EnglishLocalisation implements LocalisationInterface {
	

	@Override
	public void sayHello(String name, String sex) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Vvedite Language:");
		String language = scan.nextLine();
		System.out.print("Vvedite male/female:");
		String maleorfemaleormarried = scan.nextLine();
		if(language.equals("En")&& maleorfemaleormarried.equals("male")) {
			System.out.println("Hello,Sir");}
		if(language.equals("En")&& maleorfemaleormarried.equals("female")) {
			System.out.println("Hello,Miss");}
		if(language.equals("En")&& maleorfemaleormarried.equals("married")) {
			System.out.println("Hello,Missis");}
		
		if (language.equals("Ua")&& maleorfemaleormarried.equals("male")) {
			System.out.println("Hello,pan");}
		if(language.equals("Ua")&& maleorfemaleormarried.equals("female")) {
			System.out.println("Hello,pani");}
		
		if(language.equals("Es")&& maleorfemaleormarried.equals("male")) {
			System.out.println("Hello,Senior");}
		if(language.equals("Es")&& maleorfemaleormarried.equals("female")) {
			System.out.println("Hello,Seniora");}
		
		
		
			;
				
		}
	}
