package com.setter.injection.user;

import com.setter.injection.interf.IReceiver;

/**
 * @author vikas
 *
 */
public class Radio {
	private IReceiver receiver;

	public void setReceiver(IReceiver receiver) {
		this.receiver = receiver;
	}
	
	public void listen() {
		receiver.tuneUp();
		System.out.println("Listening Radio on 10 Hz");
	}
	
}
