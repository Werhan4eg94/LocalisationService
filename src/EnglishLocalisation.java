import java.util.Scanner;

public class EnglishLocalisation implements LocalisationInterface {
	

	@Override
	public void sayHello(String name, String maleorfemaleormarried) {
		if(maleorfemaleormarried.equals("male")) {
			System.out.println("Hello,Sir" + name);}
		if(maleorfemaleormarried.equals("female" + name)) {
			System.out.println("Hello,Miss");}
		if(maleorfemaleormarried.equals("married")) {
			System.out.println("Hello,Missis"+ name);}
basicOutput("ready"," go");
		}
}
		
		
	