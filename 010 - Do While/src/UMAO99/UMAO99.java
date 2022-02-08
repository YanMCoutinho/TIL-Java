package UMAO99;

public class UMAO99 {

	public static void main(String[] args) {
		int corAzul = 1;
		
		do {
			
			
			
			if (corAzul == 7 || corAzul == 10) {
				corAzul++;
				continue; 
			}
			
			if (corAzul == 88) {
				break;
			}
			
			System.out.println("corAzul = " + corAzul);
			corAzul++;

		} while (corAzul <= 100);

	}

}
