package trecia.savaite.pirma.paskaita;

import java.util.Random;

public class Uzduotis1While {

	public static void main(String[] args) {
		Random random = new Random();
		
		int i = 1;
		
		
		
		int b = 0;
		
		while (i < 21) {
			
			int skaicius = random.nextInt(1000);
			
			System.out.println(i +" spetas skaicius " + skaicius);
			
			i++;
	
			if(b < skaicius ) {
				b = skaicius;
			}
			
		}
		System.out.println("didziausias skaicius " + b);
		

	}

}
