package oop;

import java.util.ArrayList;

import hijava.prac.Man;

public class Main {

	public static void main(String[] args) {
		total();
		//software();
		//testinterface();
		
		
		//animal();
		
		/*private static void animal() {
			Animal dog = new Dog();
			Animal cat = new Cat();
			
			barkAnimal(dog);
			barkAnimal(cat);
		}
		
		private static void barkAnimal(Animal ani) {
			ani.bark();
		}
		
		AbstSuper sp = new AbstChild();
		int i = 5;
		int j = 10;
		
		System.out.println("min=" + sp.min(i, j) + ", max=" + sp.max(i, j));
			
		}*/

	
	}
	
	private static void total() {
		int[] arr = new int[] {1, 2, 5, 9};
		SubTotal st = new SubTotal();
		System.out.println("Total =" + st.avg(arr));
	}
	
	/*private static void testinterface() throws SQLException, IOException {
		TestInterface ti = new TestImpl();
		ti.select("select * from Table");
		TestInterface.out(100);
	}
	private static void software() {
		SoftWare we = new Website();
		SoftWare ma = new MobileApp();
		we.start();
		System.out.println("---------------");
		ma.start();
	}*/

	/*private static void animal() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		barkAnimal(dog);
		barkAnimal(cat);
	}

	private static void barkAnimal(Animal ani) {
		
		ani.bark();
		
	}*/
		
		
	}
	


