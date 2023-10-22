package org.phone;

public class InternalStorage {
	@SuppressWarnings("unused")
	private void processorName () {
		System.out.println("Processor Name: octa-core Max 2.2GHz Snapdragon 695");
	}
	@SuppressWarnings("unused")
	private void ramSize () {
		System.out.println("RAM Size: 8 GB ");
	}
	public static void main(String[]args) {
		InternalStorage is = new InternalStorage();
		is.processorName();
		is.ramSize();
		
//		ExternalStorage es = new ExternalStorage();
//		es.size();
	}

}
