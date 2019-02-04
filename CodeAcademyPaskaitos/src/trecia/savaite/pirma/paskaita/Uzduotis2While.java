package trecia.savaite.pirma.paskaita;

import java.util.Scanner;

public class Uzduotis2While {

	public static void main(String[] args) {

		Scanner ivestas = new Scanner(System.in);

		String vartotojoTekstas = "";

		while (vartotojoTekstas != "viso gero") {
			System.out.println("iveskite teksta ");
			String tekstas = ivestas.nextLine();

			System.out.println("sakinys sudarytas is " + tekstas.length() + " simboliu.");
			System.out.println("paskutinis zodis yra " + tekstas.charAt(tekstas.lastIndexOf(' ')));

			tekstas = vartotojoTekstas;
ivestas.close();
		}

	}

}
