package pirma.savaite.antra.paskaita;

import java.util.Scanner;

public class Masyvai3 {

	public static void main(String[] args) {

		String[] dienos = { "pirmadienis", "antradienis", "treciadienis", "ketvirtadienis", "penktadienis",
				"sestadienis", "sekmadienis" };

		System.out.println("masyvas 'dienos' dydis " + dienos.length);
		System.out.println("masyvo paskutine reiksme " + dienos[dienos.length - 1]);
		System.out.println("iveskite skaiciu nuo 1 iki 7");
		Scanner skeneriux = new Scanner(System.in);
		System.out.println("Jusu pasirinkta diena: "+dienos[skeneriux.nextInt() - 1]);

		for (int i = 0; i < dienos.length; i++) {
			System.out.println(dienos[i]);
			skeneriux.close();
			
		}

	}
}
