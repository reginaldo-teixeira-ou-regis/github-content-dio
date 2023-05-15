package subsystem1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void registerClient(String name, String zipCode, String city, String state) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(name);
		System.out.println(zipCode);
		System.out.println(city);
		System.out.println(state);
	}
}
