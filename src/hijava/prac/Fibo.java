package hijava.prac;

public class Fibo {

	public static void main(String[] args) {
		int num = 10;
		for(int i = 0; i < num; i++) {
		System.out.println(fibo(i));
		}
		
	}
	private static int fibo(int num) {
	
			if(num<=1) {
				return 1;
			} else {
				return fibo(num-1) + fibo(num-2);
				
				}
		
		

}
}

