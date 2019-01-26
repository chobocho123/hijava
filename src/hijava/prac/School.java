package hijava.prac;


public class School {

	public static void main(String[] args) {
		Score Korean = new Score();
		Korean.setSubject("국어");
		Korean.setScore(90);
		
		Score math = new Score("수학", 80);
		
		Score science = new Score("과학");
		
		
		String k = Korean.toString();
		System.out.println(Korean.toString());
		System.out.println(k);
		System.out.println(math.toString());
		System.out.println(science);
	}

}
