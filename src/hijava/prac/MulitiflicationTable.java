package hijava.prac;

public class MulitiflicationTable {

	public static void main(String[] args) {
		
		for( int i=2; i<10; i++) {
			System.out.println("----------------"+i+"단");
			if(i%2==1) {
				continue;
			
			}
			for( int j=1; j<10; j++) {
				
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
	}

}
