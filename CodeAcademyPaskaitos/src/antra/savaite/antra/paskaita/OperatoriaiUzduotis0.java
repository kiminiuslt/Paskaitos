package antra.savaite.antra.paskaita;

import java.util.Scanner;

public class OperatoriaiUzduotis0 {

	static String tekstas; // static / dinamic priekyje nurodo kokie metodai, static ar dinamik ji gali naudoti.
	int  a; 

	public static void main(String[] args) {

		ivestireiksme();
		didziosios();
		spausdint();

	}

	private static void spausdint() {

		System.out.println(tekstas);

	}

	private static void didziosios() {

		tekstas = tekstas.toUpperCase();

	}

	private static void ivestireiksme() {
		Scanner skan = new Scanner(System.in);
		System.out.println("iveskite reiksme");

		tekstas = skan.nextLine();

	}
}
