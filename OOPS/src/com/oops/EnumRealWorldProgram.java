package com.oops;

enum TRAFFIC_SIGNAL {
	RED , YELLOW , GREEN
}

class Signal {
	TRAFFIC_SIGNAL signal ;
	
	Signal(TRAFFIC_SIGNAL signal){
		this.signal = signal;
	}
	
	void ShowAction() {
		switch(signal) {
		case RED:
			System.out.println("STOP!");
			break;
		
		case YELLOW:
			System.out.println("READY!");
			break;
		
		case GREEN:
			System.out.println("GO!");
			break;
		default:
			System.out.println("invalid signal");
			break;
		
		
		}
	}
}

public class EnumRealWorldProgram {
	public static void main(String[] args) {
		Signal s1 = new Signal(TRAFFIC_SIGNAL.RED);
		s1.ShowAction();
	}

}
