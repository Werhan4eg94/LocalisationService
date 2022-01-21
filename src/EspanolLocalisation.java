import java.time.LocalDateTime;

public class EspanolLocalisation implements LocalisationInterface {

	@Override
	public void sayHello(String name, String sex,int age) {
		if (sex.equals("male")&age%2==1) {
			System.out.println("Hello,senior " + name);
			System.out.println(LocalDateTime.now());
		}
		if (sex.equals("female")&age%2==0) {
			System.out.println("Hello,seniora " + name);
			System.out.println(LocalDateTime.now());
		}

	
	}

	
		
	}
