package trecia.savaite.pirma.paskaita;

public class Uzduotis8For {

	public static void main(String[] args) {
		
		int[]pirmas = {3 , 80 , 7, 8, 5, 6, 9, 15, 30, 1, 8};
		int a = 0;
		
		for(int m = 0; m < pirmas.length; m++ ) {
		
			if(pirmas[m] > a) {
				
				a = pirmas[m];
			}
			
		}
		System.out.println(a);
	}

}
