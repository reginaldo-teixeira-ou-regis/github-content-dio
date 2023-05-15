package subsystem2.zipCode;

public class ZipCodeApi {

	private static ZipCodeApi instance = new ZipCodeApi();

	private ZipCodeApi() {
		super();
	}

	public static ZipCodeApi getInstance() {
		return instance;
	}
	
	public String recoverCity(String cep) {
		return "Arapongas";
	}
	
	public String recoverState(String cep) {
		return "PR";
	}
}
