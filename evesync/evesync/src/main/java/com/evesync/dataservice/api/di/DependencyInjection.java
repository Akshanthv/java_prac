package com.evesync.dataservice.api.di;

public class DependencyInjection {

	public static void main(String[] args) {
		
		IntelProcessor ip = new IntelProcessor();
		AMDProcessor ap = new AMDProcessor();
		
		Computer c = new Computer(ip);
		c.executeProcess();
	}
}
