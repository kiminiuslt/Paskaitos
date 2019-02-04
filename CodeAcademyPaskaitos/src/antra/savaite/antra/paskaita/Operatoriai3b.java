package antra.savaite.antra.paskaita;

import java.util.Scanner;

public class Operatoriai3b {
	public static void main(String[] args) {

		String r2 = "ivesta du";
		String r3 = "ivesta trys";
		String melas = "ivesta kita reiksme";
		Scanner skan = new Scanner(System.in);

		System.out.println("iveskite skaiciu");
		int ivestasSkaicius = skan.nextInt();

		boolean arReiksme2 = ivestasSkaicius == 2;
		
		String kaSpausdint = arReiksme2 ? r2 : ivestasSkaicius == 3? r3 :  melas;

		System.out.println(kaSpausdint);
	}
}
