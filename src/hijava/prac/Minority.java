package hijava.prac;


public class Minority {

	/*public static void main(String[] args) {
		
	int k=0;
		//boolean isPrime = true;
		
	for(int i = 2; i < 101; i++) {
		boolean isPrime = true;	
		for(int j = 1; j < 100; j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
				
				
			}
			
			
			if(isPrime) {
				k+=i;
			}
			
		}
		
		
	System.out.println(k);
		}*/
	public static void main(String[] args) {
		System.out.println("result2=" + factorial(num));
	}
	private static int factorial(int num) {
		System.out.println("factorial(" + num + ")");

		if (num <= 1) return 1;

		return num * factorial(num - 1);
	}

	}


