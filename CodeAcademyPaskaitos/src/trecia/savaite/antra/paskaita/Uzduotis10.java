package trecia.savaite.antra.paskaita;

public class Uzduotis10 {

	public static void main(String[] args) {
		
		int rezultatas = laipsnis (5,2);
		
		System.out.println("5 kvadratu yra " + rezultatas);
		System.out.println("256 kvadratu yra " + laipsnis(256,3));
		

	}

	private static int laipsnis(int a, int b) {
		
		int z = a;
		
		
		
		for(int c = 0; c <= b; c++) {
			
			z = z * b;			
		}
			
			

		
		
		
		
		return z;
	}

}
