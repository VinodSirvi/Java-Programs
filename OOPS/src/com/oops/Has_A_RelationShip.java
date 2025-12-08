package com.oops;

class xyz {
	int a = 10;
}

class RDF {
	
	xyz a1;
	
	void show ()  {
		
		a1 = new xyz() ;
		System.out.println(a1.a);
	}
}


public class Has_A_RelationShip {

	
	public static void main(String[] args) {
		
		RDF b1 = new RDF();
		b1.show();
	}
}
