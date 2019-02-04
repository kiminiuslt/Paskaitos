package trecia.savaite.pirma.paskaita;

import java.util.Random;

public class Uzduotis3atsitiktinumoPatikrinimas {

	public static void main(String[] args) {

		Random spejimai = new Random();

		int[] b = new int[10];

		for (int counter = 0; counter < 100; counter++) {

			int a = spejimai.nextInt(10);

			b[a] = b[a] + 1;
		}
		
		for (int counter = 0; counter < 11; counter++) {
		System.out.println( counter  + " buvo ivestas " + b[counter] + " vnt.");
		
		}
	}

}
