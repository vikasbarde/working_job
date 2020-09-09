package com.setter.injection.interf.impl;

import com.setter.injection.interf.IReceiver;

public class Receiver10HzImpl implements IReceiver {

	@Override
	public void tuneUp() {
		System.out.println("Tune up with 10 Hz Receiver!");
	}

}
