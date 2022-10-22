package com.evesync.dataservice.api.di;

public class Computer {
	
	Processor processor;
	
	public Computer(Processor processor) {
		this.processor = processor;
	}

	public void executeProcess() {
		processor.startProcess();
		processor.stopProcess();
	}
}
