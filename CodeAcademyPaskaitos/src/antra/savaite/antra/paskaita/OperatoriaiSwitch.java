package antra.savaite.antra.paskaita;

import java.util.Scanner;

public class OperatoriaiSwitch {

	public static void main(String[] args) {
		Scanner skan = new Scanner(System.in);
		System.out.println("iveskite skaiciu");
		int ivestasSkaicius = skan.nextInt();

		switch (ivestasSkaicius) {

		case 1:
			System.out.println("vienas");
			break;
		case 2:
			System.out.println("du");
			break;
		case 3:
			System.out.println("trys");
			break;
		case 4:
			System.out.println("keturi");
			break;
		case 5:
			System.out.println("penki");
			break;
		case 6:
			System.out.println("sesi");
			break;
		case 7:
			System.out.println("septyni");
			break;
		case 8:
			System.out.println("astuoni");
			break;

		case 9:
			System.out.println("devyni");
			break;
		case 10:
			System.out.println("desimt");
			break;

		// boolean netiesa = ivestasSkaicius > 10;

		}

	}

}
