package dev.rt.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.zipCode.ZipCodeApi;

public class Facade {

	public void migrateClient(String name, String zipCode) {
		String city = ZipCodeApi.getInstance().recoverCity(zipCode);
		String state = ZipCodeApi.getInstance().recoverState(zipCode);
		
		CrmService.registerClient(name, zipCode, city, state);
	}
}
