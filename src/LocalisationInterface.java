
public interface LocalisationInterface {
	
	default void basicOutput(String status, String notes) {
	    System.out.println("Hello " + status + notes);
	}
	
	void sayHello(String name, String sex);
}
