package com.oops;
class outer {
	
	 void outerLogic() {
		 System.out.println("outer class method called");
		 
	 }
	 
	 void implimentation_of_innerClassMethod() {
		 
		 inner i1 = new inner();
		 i1.innerLogic();
	 }
	
	class inner {
		
		inner() {
			
		}
		
		void innerLogic() {
			
			System.out.println("inner method called");
		}
	}
}


public class NestedClass {
	
	public static void main(String[] args) {
		
		outer o1 = new outer() ;
		o1.implimentation_of_innerClassMethod();
	}

}
