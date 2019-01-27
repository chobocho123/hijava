package oop;

/*import java.util.ArrayList;

import hijava.prac.Man;*/

public class Main {

	public static void main(String[] args) {
		
		drinkTest();
		
		/*Mom mom = new Mom();
		Son son = new Son();
		
		mom.eat();
		son.eat();
		
		mom.say();
		son.say();
		
		son.ttt();
		mom.ttt();
	*/}

	private static void drinkTest() {
		Mom mom = new Mom();
		Mom son = new Son();
		
		drink(mom);
		drink(son);
	}
	
	private static void drink(Mom m) {
		if( m instanceof Son) {
			Son s = (Son) m;
			s.drinkMilk();
		} else {
			m.drinkBeer();
			
			
			
			
		}
	}
	

}
