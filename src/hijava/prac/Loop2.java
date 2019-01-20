package hijava.prac;

public class Loop2 {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		while (i<100) {
			i++;
			if(i % 2 == 0)
				continue;
			//if(i%2==1)
			j+=i;
			
	}
		System.out.println(j);
}
}