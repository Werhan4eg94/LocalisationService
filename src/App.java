
public class App {
	
	
	public static void main(String[] args) {
		LocalisationInterface localisationEn = new EnglishLocalisation();
		localisationEn.sayHello("Andrey", "male");}
	{
		LocalisationInterface localisationUa = new UaLocalisation();
		localisationUa.sayHello("Emma", "female");
	}
}

