package trecia.savaite.pirma.paskaita;

import java.util.Random;
import java.util.Scanner;

public class Uzduotis2Random {

	static int ivestasSkaicius;
	static int teisingasSkaicius;
	static int counter;

	public static void main(String[] args) {

		Random generatorius = new Random();

		int teisingasSkaicius = generatorius.nextInt(99) + 1;

		for (counter = 0; counter < 10; counter++) {
			spejimai();

			if (ivestasSkaicius > teisingasSkaicius) {
				System.out.println("ivestas skaicius per didelis, bandykite dar karta.");

			} else if (ivestasSkaicius < teisingasSkaicius) {
				System.out.println("ivestas skaicius per mazas, bandykite dar karta.");

			} else if (ivestasSkaicius == teisingasSkaicius) {
				System.out.println("Sveikiname! jus atspejote");
				break;
			} else if (counter == 10) {
				System.out.println("jus pralaimejote...");
			}

		}

	}


		

	

	private static void spejimai() {

		System.out.println("iveskite pasirinkta skaiciu");

		Scanner skan = new Scanner(System.in);

		ivestasSkaicius = skan.nextInt();
		

	}

}
