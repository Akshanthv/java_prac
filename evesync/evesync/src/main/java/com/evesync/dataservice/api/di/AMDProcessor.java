package com.evesync.dataservice.api.di;

public class AMDProcessor implements Processor{

	@Override
	public void startProcess() {
		System.out.println("Started AMD Process");
		
	}

	@Override
	public void stopProcess() {
		System.out.println("Stopped AMD Process");
		
	}

}
