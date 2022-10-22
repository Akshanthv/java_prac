package com.evesync.dataservice.api.di;

public class IntelProcessor implements Processor{

	@Override
	public void startProcess() {
System.out.println("Started Intel Process");
		
	}

	@Override
	public void stopProcess() {
		System.out.println("Stoped Intel Process");
		
	}

}
