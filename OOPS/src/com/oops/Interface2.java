package com.oops;

interface Remote {
	
	void PowerOn();
	void PowerOff();
	void VolumeUp();
	void VolumeDown();
	
}

class SonyTv implements Remote {
	
	public void PowerOn() {
		System.out.println("Tv Power On");
	}
	
	
	public void PowerOff() {
		System.out.println("tv power off");
	}
	
	public void VolumeUp() {
		System.out.println("tv volume up");
	}
	
	public void VolumeDown() {
		System.out.println("tv volume down");
	}
}


public class Interface2 {

	public static void main(String[] args) {
		
		Remote r1 = new SonyTv();
		
		r1.PowerOn();
		r1.PowerOff();
		r1.VolumeUp();
		r1.VolumeDown();
	}
}
