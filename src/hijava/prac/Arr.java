package hijava.prac;

public class Arr {

	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
	
	}

	
	private static void ex1() {
		int[] nums = new int[100];
		
		for( int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		
		for( int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	private static void ex2() {
		String[] strs = new String[100];
		
		int len = strs.length;
		
		for(int i = 0; i < len; i++) {
			strs[i] = "str" + (i + 1);
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println(strs[i]);
		}
	}
	private static void ex3() {
		String[] strk = new String[10];
		
		int len = strk.length;
		
		for(int i = 0 ; i < len; i++) {
			strk[i] = "김" + (i + 1) + "수";
		}
		
		for(int i = 0 ; i < len; i++) {
			System.out.println(strk[i]);
		}
		
		
	}
	
	

}
