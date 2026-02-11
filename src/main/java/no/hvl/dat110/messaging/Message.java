package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	// the up to 127 bytes of data (payload) that a message can hold
	private byte[] data;

	// construction a Message with the data provided
	public Message(byte[] data) {
		
		
		if (data.length != 0 && data.length < 128) {
			this.data = data;
		}
		
		else if (data.length == 0) {
			System.out.println("Melding er tom");
		}
		
		else if (data.length > 127) {
			System.out.println("Melding er for lang");
		}

	}
	

	public byte[] getData() {
		return this.data; 
	}

}
